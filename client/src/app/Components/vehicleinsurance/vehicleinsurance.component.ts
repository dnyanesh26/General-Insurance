import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { VehicleHttpClientService } from 'src/app/Service/Vehicle/vehicle-http-client.service';
@Component({
  selector: 'app-vehicleinsurance',
  templateUrl: './vehicleinsurance.component.html',
  styleUrls: ['./vehicleinsurance.component.css']
})
export class VehicleinsuranceComponent implements OnInit {
 vehiclef:any;
  
  //Create FormGroup
  ngOnInit(): void {
    //form initialization
    // this.vehicle = this.fb.group({
    //   vehMfg:['',[Validators.required],
    //   vehModel:['',[Validators.required],
    //   drivingLic:['',[Validators.required],
    //   vehicleAge:['',[Validators.required],
    //   vehRegNo:['',[Validators.required],
    //   chasisNumber:['',[Validators.required,Validators.maxLength(6)],
    //   vehType:['Four Wheeler',Validators.required]
       
  
    // })
  }
  vehicle:FormGroup;
  // isDisabled:boolean=true;
  
  // submitted:boolean=true;
  constructor(private vehSer:VehicleHttpClientService,private fb: FormBuilder,private router: Router) {
    //this.myForm();
    // "vehvehRegNo": 1107,
    // "vehType": "Four",
    // "vehMfg": "TOYOTA",
    // "vehModel": "cruise",
    // "drivingLic": "drivingLic209",
    // "vehicleCost":200000,
    // "vehicleAge": 3,
    // "chasisNumber": 776,
    // this.vehicle = new FormGroup({
    //   vehvehRegNo: new FormControl(''),
    //   vehType: new FormControl(''),
    //   vehMfg: new FormControl(''),
    //   vehModel: new FormControl(''),
    //   drivingLic: new FormControl(''),
    //   vehicleCost: new FormControl(''),
    //   vehicleAge: new FormControl(''),
    //   chasisNumber: new FormControl('')
    // });
    this.vehicle = this.fb.group({
      vehMfg:['',[Validators.required]],
      vehModel:['',[Validators.required]],
      drivingLic:['',[Validators.required]],
      vehicleAge:['',[Validators.required,Validators.pattern('[0-8]*')]],
      vehRegNo:['',[Validators.required]],
      chasisNumber:['',[Validators.required,Validators.maxLength(6)]],
      vehType:['Four Wheeler',[Validators.required]],
      vehicleCost:['',[Validators.required]],
  })
}

  // //Create required field validator for name
  // // myForm() {
  // //   this.vehicle = this.fb.group({
  // //   name: ['',[ Validators.required ]
  // //   });
    

    
  //   }
    get vehMfg(){
      return this.vehicle.get('vehMfg');
 }
 get vehModel(){
  return this.vehicle.get('vehModel');
}
get drivingLic(){
  return this.vehicle.get('drivingLic');
}
get vehicleAge(){
  return this.vehicle.get('vehicleAge');
}
get vehRegNo(){
  return this.vehicle.get('vehRegNo');
}
 get chasisNumber(){
  return this.vehicle.get('chasisNumber');
}
get vehicleCost(){
  return this.vehicle.get('vehicleCost');
}


onSubmit(value:any){	
   
  

     
  this.vehSer.regVeh(value).subscribe(
    response=>
    {       this.vehiclef=response;
            console.log(this.vehiclef);
            sessionStorage.setItem('policyType','vehicle');
            sessionStorage.setItem('vehRegNo',value.vehRegNo);
            sessionStorage.setItem('vehicleAge',value.vehicleAge);
            sessionStorage.setItem('vehicleCost',value.vehicleCost);
            alert("vehicle registered. Please Select Policy")
            this.router.navigate(['policy'])
            // this.router.navigate(['/policy']); 
    },
    err=>{
        alert("vehicle exists")
        window.location.reload();
      });
      
  
  
}

  

  
    // isDisabled:true;
    
  

}
