import { Component, OnInit } from '@angular/core';
import { ClaimHttpClientService } from 'src/app/Service/Claim/claim-http-client.service';

@Component({
  selector: 'app-myclaims',
  templateUrl: './myclaims.component.html',
  styleUrls: ['./myclaims.component.css']
})
export class MyclaimsComponent implements OnInit {

  claimList:any;

  constructor(private ClaimSer:ClaimHttpClientService) { }

  ngOnInit(): void {

    const userId = {
      
      "Id": sessionStorage.getItem('userId')
    
  }

    this.ClaimSer.getClaimList(userId).subscribe(
      response=>{
        this.claimList=response;
      console.log(this.claimList);
        
    })
  }

}
