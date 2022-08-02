import { DatePipe } from '@angular/common';
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
  policyDate:any;
  policyExpire:any;
  constructor(private fb: FormBuilder,private router: Router,private policySer:PolicyHttpClientService,private datePipe: DatePipe) {

    this.PolicyForm= new FormGroup({
      planType:new FormControl('',[Validators.required]),
      planTerm: new FormControl('',[Validators.required,Validators.pattern('[1-4]*')]),
      premium:new FormControl(''),
      
   })
   var d = new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var day = d.getDate();
    this.policyExpire=new Date(year + 1, month, day);
    this.policyExpire = this.datePipe.transform(this.policyExpire, 'yyyy-MM-dd');
   this.policyDate = new Date();
   this.policyDate = this.datePipe.transform(this.policyDate, 'yyyy-MM-dd');
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
      this.plantypemul=0.025;
    }
    else{
      this.plantypemul=0.01;
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
    let test=+this.vehicleAgeval + +this.plantypemul
    console.log(test)
    this.premium=Math.floor(this.vehicleCost*(test))
    console.log(this.premium)
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
    var toAppend;
    
   if(sessionStorage.getItem('policyType')=="vehicle"){
    toAppend = {
      "policyDate":this.policyDate,
      "policyExpire":this.policyExpire,
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
    var d = new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var day = d.getDate();
    this.policyExpire=new Date(year, month+1, day);
    this.policyExpire = this.datePipe.transform(this.policyExpire, 'yyyy-MM-dd');
    toAppend = {
      "policyDate":this.policyDate,
      "policyExpire":this.policyExpire,
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
              this.router.navigate(['viewinsurance']); 
      },
      err=>{
          alert("policy exists")
        });

  }

}


