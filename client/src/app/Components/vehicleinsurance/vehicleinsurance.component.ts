import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-vehicleinsurance',
  templateUrl: './vehicleinsurance.component.html',
  styleUrls: ['./vehicleinsurance.component.css']
})
export class VehicleinsuranceComponent implements OnInit {
  //Create FormGroup
  
  vehicle!:FormGroup;
  user:any;
  submitted:boolean=true;
  constructor(private fb: FormBuilder) {
    //this.myForm();
    
  }

  // //Create required field validator for name
  // // myForm() {
  // //   this.vehicle = this.fb.group({
  // //   name: ['', Validators.required ]
  // //   });
    

    
  //   }
    get vehiclemfg(){
      return this.vehicle.get('vehiclemfg');
 }
 get vehiclemodel(){
  return this.vehicle.get('vehiclemodel');
}
get dl(){
  return this.vehicle.get('dl');
}
get purchDate(){
  return this.vehicle.get('purchDate');
}
get regNo(){
  return this.vehicle.get('regNo');
}
 get chasisNo(){
  return this.vehicle.get('chasisNo');
}


onSubmit(){	
  console.warn(this.vehicle.value)
}

  

  ngOnInit(): void {
    //form initialization
    this.vehicle = this.fb.group({
      vehiclemfg:['',Validators.required],
      vehiclemodel:['',Validators.required],
      dl:['',Validators.required],
      purchDate:['',Validators.required],
      regNo:['',Validators.required],
      chasisNo:['',Validators.required,Validators.maxLength(6)] 

    })
    
  }

}
