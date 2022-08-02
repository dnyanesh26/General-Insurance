import { Component, OnInit } from '@angular/core';
import { AdminHttpClientService } from 'src/app/Service/Admin/admin-http-client.service';
import { PolicyHttpClientService } from 'src/app/Service/Policy/policy-http-client.service';

@Component({
  selector: 'app-admin-ins',
  templateUrl: './admin-ins.component.html',
  styleUrls: ['./admin-ins.component.css']
})
export class AdminInsComponent implements OnInit {
  policyList: any;
  vehicleList: any;
  ticketList: any;

  constructor(private adminSer:AdminHttpClientService,private policySer:PolicyHttpClientService) { }

  ngOnInit(): void {
    this.adminSer.getPolicyList().subscribe(
      response=>{
        this.policyList=response;
      
        
    })
    this.adminSer.getVehicleList().subscribe(
      response=>{
        this.vehicleList=response;
     
        
    })
  
    this.adminSer.getTicketList().subscribe(
      response=>{
        this.ticketList=response;
      
        
    })
  }

  deletePolicy(p:any){

    const policy={
      "policyNo":p
    }
    this.policySer.deletePolicy(policy).subscribe(
      response=>
      {       
              alert("Policy Deleted.")
              window.location.reload(); 
      },
      err=>{
        console.log(err)
          alert("policy not available")
        });

  }
}
