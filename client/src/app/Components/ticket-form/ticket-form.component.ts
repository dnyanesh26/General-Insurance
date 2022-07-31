import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ticket-form',
  templateUrl: './ticket-form.component.html',
  styleUrls: ['./ticket-form.component.css']
})
export class TicketFormComponent implements OnInit {
  //Create FormGroup
  
  ticketForm!:FormGroup;
  user:any;

  constructor(private fb: FormBuilder,private router: Router ) { 
    this.ticketForm= new FormGroup({
      ticketNo: new FormControl(''),
      departureLoc: new FormControl(''),
      travelDate: new FormControl(''),
      travelMode: new FormControl('')
      
    })
  }

  ngOnInit(): void {
  }
  onSubmit(value:any){}

}
