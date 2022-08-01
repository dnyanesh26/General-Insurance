import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ClaimHttpClientService } from 'src/app/Service/Claim/claim-http-client.service';
import { PolicyHttpClientService } from 'src/app/Service/Policy/policy-http-client.service';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';

@Component({
  selector: 'app-claimrecords',
  templateUrl: './claimrecords.component.html',
  styleUrls: ['./claimrecords.component.css']
})
export class ClaimrecordsComponent implements OnInit {

  requiredForm!: FormGroup;
  policyList:any;
  claim:any;

  constructor(private fb: FormBuilder,private claimSer:ClaimHttpClientService,private userSer:UserHttpClientService) {
    this.requiredForm = this.fb.group({
      reason: ['', Validators.required ],
      amount: ['', Validators.required ],
      claimDate: ['', Validators.required],
      policyNo:['', Validators.required]
      });
  }

  

  ngOnInit(): void {

    const userId = {
      
        "Id": sessionStorage.getItem('userId')
      
    }
    this.userSer.getPolicyList(userId).subscribe(
      response=>{
        this.policyList=response;
      console.log(this.policyList);
        
    })
  }

  onSubmit(value:any){
    this.claim=Object.assign({}, value);
    delete this.claim.policyNo;
    console.log(value);
    const toAppend = {
      "status":"Not Approved",
      "policy":{
        "policyNo":value.policyNo
    },
    }
    const claim = { ...toAppend, ...this.claim };
    console.log(claim);
  }

}
