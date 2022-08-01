import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { TicketHttpClientService } from 'src/app/Service/Ticket/ticket-http-client.service';

@Component({
  selector: 'app-ticket-form',
  templateUrl: './ticket-form.component.html',
  styleUrls: ['./ticket-form.component.css']
})
export class TicketFormComponent implements OnInit {
  //Create FormGroup
  
  ticketForm!:FormGroup;
  user:any;
  premium:number=0;
  ticket:any;
  constructor(private fb: FormBuilder,private router: Router,private tickSer:TicketHttpClientService ) { 
    this.ticketForm= new FormGroup({
      ticketNo: new FormControl(''),
      departureLoc: new FormControl(''),
      arrivalLoc: new FormControl(''),
      travelDate: new FormControl(''),
      travelMode: new FormControl(''),
      travleTime:new FormControl('')
      
    })
  }

  ngOnInit(): void {
  }

  


  onSubmit(value:any){

    this.ticket=value;
    
    console.log(this.ticket)
    this.tickSer.regTick(value).subscribe(
      response=>
      {       
              console.log(response);
              sessionStorage.setItem('travelMode',value.travelMode);
              sessionStorage.setItem('ticketNo',value.ticketNo);
              sessionStorage.setItem('policyType','travel');
              alert("Ticket registered. Please Select Policy")
              this.router.navigate(['policy'])
              
      },
      err=>{
          alert("Ticket exists")
          window.location.reload();
        });
  }

  

}
