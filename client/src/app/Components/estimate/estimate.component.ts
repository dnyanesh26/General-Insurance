import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-estimate',
  templateUrl: './estimate.component.html',
  styleUrls: ['./estimate.component.css']
})
export class EstimateComponent implements OnInit {

  
  principal!: number;
  rate!:number;
  time!:number;
   si!:number;
   amt!:number;

  simpleInterest(){
    this.si=(this.principal*this.rate*this.time)/(100*12);
    this.amt=this.si+this.principal;
  }//SI() ends
  

  ngOnInit(): void {
  }

}
