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
  constructor(private fb: FormBuilder) {
    this.myForm();
    
  }

  //Create required field validator for name
  myForm() {
    this.vehicle = this.fb.group({
    name: ['', Validators.required ]
    });
 }

  

  

  ngOnInit(): void {
  }

}
