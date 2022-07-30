import { Component, OnInit } from '@angular/core';
import{FormControl,FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-claimrecords',
  templateUrl: './claimrecords.component.html',
  styleUrls: ['./claimrecords.component.css']
})
export class ClaimrecordsComponent implements OnInit {

  constructor() {}

  // ClaimForm = new FormGroup({
  //   amount = new FormControl(Validators.required)
  // })

  ngOnInit(): void {
  }

}
