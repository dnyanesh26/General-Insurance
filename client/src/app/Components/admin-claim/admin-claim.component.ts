import { Component, OnInit } from '@angular/core';
import { AdminHttpClientService } from 'src/app/Service/Admin/admin-http-client.service';
import { PolicyHttpClientService } from 'src/app/Service/Policy/policy-http-client.service';

@Component({
  selector: 'app-admin-claim',
  templateUrl: './admin-claim.component.html',
  styleUrls: ['./admin-claim.component.css']
})
export class AdminClaimComponent implements OnInit {
claimList:any;
  constructor(private adminSer:AdminHttpClientService,private policySer:PolicyHttpClientService) { }

  ngOnInit(): void {
    this.adminSer.getClaimList().subscribe(
      response=>{
        this.claimList=response;
      
        
    })
  }
  approve(c:any){
    delete c.status;
    const tempc=c;
    const toAppend = {
      "status":"Approved"
    }
    const Fclaim = { ...toAppend, ...tempc };
    // console.log(Fclaim)
    this.adminSer.appClaim(Fclaim).subscribe(
      response=>
      {      
        alert("Claim Approved") 
        window.location.reload();
              
              
      },
      err=>{
        console.log(err)
          alert("Claim error")
          window.location.reload();
        });
  }

}
