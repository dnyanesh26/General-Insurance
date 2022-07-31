import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-claimrecords',
  templateUrl: './claimrecords.component.html',
  styleUrls: ['./claimrecords.component.css']
})
export class ClaimrecordsComponent implements OnInit {

  requiredForm!: FormGroup;

  constructor(private fb: FormBuilder) {
    this.myForm();
  }

  myForm() {
    this.requiredForm = this.fb.group({
    amount: ['', Validators.required ],
    claimDate: ['', Validators.required]
    });
 }

  ngOnInit(): void {
  }

}
