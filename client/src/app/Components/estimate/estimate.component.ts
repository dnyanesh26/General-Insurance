import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-estimate',
  templateUrl: './estimate.component.html',
  styleUrls: ['./estimate.component.css']
})
export class EstimateComponent implements OnInit {
  vehiclevalue: number=0;
  amt:number=0;
  vehicleAge:number=0;
  Insurancetype:number=0;
  constructor(){
   
  }
  

  estimatepremium(){
    console.log(this.Insurancetype)
    var value=(+this.vehicleAge+ +this.Insurancetype);
    console.log(value);
    this.amt=(this.vehiclevalue*value);
    console.log(this.amt)
  }
  

  ngOnInit(): void {
  }

}
