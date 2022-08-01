import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-policy',
  templateUrl: './policy.component.html',
  styleUrls: ['./policy.component.css']
})
export class PolicyComponent implements OnInit {

  PolicyForm!: FormGroup;
  user:any;

  constructor(private fb: FormBuilder,private router: Router) {

    this.PolicyForm= new FormGroup({
      policyTerm: new FormControl(''),
      premium: new FormControl('')
   })

  }

  ngOnInit(): void {
  }
  onSubmit(value:any){}

}


