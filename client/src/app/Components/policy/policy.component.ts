import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PolicyHttpClientService } from 'src/app/Service/Policy/policy-http-client.service';


@Component({
  selector: 'app-policy',
  templateUrl: './policy.component.html',
  styleUrls: ['./policy.component.css']
})
export class PolicyComponent implements OnInit {

  PolicyForm!: FormGroup;
  policy:any;
  premium:number=0;
  vehicleAge:number=0;
  vehicleCost:number=0;
  plantypemul:number=0;
  vehicleAgeval:number=0;
  constructor(private fb: FormBuilder,private router: Router,private policySer:PolicyHttpClientService) {

    this.PolicyForm= new FormGroup({
      planType:new FormControl('',[Validators.required]),
      planTerm: new FormControl('',[Validators.required]),
      premium:new FormControl('')
   })
   
   this.PolicyForm.controls['premium'].disable();
   if(sessionStorage.getItem('policyType')=='travel')
   {
    this.PolicyForm.controls['planTerm'].disable();
   }
  }
  get planType(){
    return this.PolicyForm.get('planType');
  }
  get planTerm(){
    return this.PolicyForm.get('planTerm');
  }
  // get premium1(){
  //   return this.PolicyForm.get('premium1');
  // }

  ngOnInit(): void {
  }
  calculatePremium(){
    if(sessionStorage.getItem('policyType')=="vehicle"){
    this.vehicleAge=Number(sessionStorage.getItem('vehicleAge'));
    this.vehicleCost=Number(sessionStorage.getItem('vehicleCost'));

    if(this.PolicyForm.value.planType=="Comprehensive")
    {
      this.plantypemul=0.02;
    }
    else{
      this.plantypemul=0;
    }

    if(this.vehicleAge<=1)
    {
      this.vehicleAgeval=0.06
    }
    if(this.vehicleAge>=1 && this.vehicleAge<=2)
    {
      this.vehicleAgeval=0.05
    }
    if(this.vehicleAge>=2 && this.vehicleAge<=3)
    {
      this.vehicleAgeval=0.04
    }
    if(this.vehicleAge>=3 && this.vehicleAge<=4)
    {
      this.vehicleAgeval=0.03
    }
    
    this.premium=Math.floor(this.vehicleCost*(+this.vehicleAgeval + +this.plantypemul))
  }
  if(sessionStorage.getItem('policyType')=="travel")
  {
    if(sessionStorage.getItem('travelMode')=="AIRWAYS")
    {
      this.premium=4500;
    }
    if(sessionStorage.getItem('travelMode')=="ROAD")
    {
      this.premium=3000;
    }
    if(sessionStorage.getItem('travelMode')=="TRAIN")
    {
      this.premium=2000;
    }
  } 
  }
  onSubmit(value:any){
    var toAppend
   if(sessionStorage.getItem('policyType')=="vehicle"){
    toAppend = {
      "policyType":sessionStorage.getItem('policyType'),
      "premium":this.premium,
      "vehicle":{
      "vehRegNo":sessionStorage.getItem('vehRegNo')
      },
      "user": {
        "userId": sessionStorage.getItem('userId')
      },
    }
  }
  if(sessionStorage.getItem('policyType')=="travel"){
    delete value.planTerm;
    toAppend = {
      "planTerm":0,
      "policyType":sessionStorage.getItem('policyType'),
      "premium":this.premium,
      "ticket":{
        "ticketNo":sessionStorage.getItem('ticketNo')         
      },
      "user": {
        "userId": sessionStorage.getItem('userId')
      },
    }
  }
    const temp = { ...toAppend, ...value };
    this.policy=temp;
    console.log(this.policy)
    this.policySer.policyReg(this.policy).subscribe(
      response=>
      {       console.log(response);
              alert("Policy Registered.")
              this.router.navigate(['policy']); 
      },
      err=>{
          alert("user exists")
        });

  }

}


