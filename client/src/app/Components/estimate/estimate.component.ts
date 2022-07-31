import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-estimate',
  templateUrl: './estimate.component.html',
  styleUrls: ['./estimate.component.css']
})
export class EstimateComponent implements OnInit {

  
   vehiclevalue!: number;
   amt!:number;
   vehicleAge!:number;
   Insurancetype!:number;
   
  

  estimatepremium(){
    console.log(this.Insurancetype)
    this.amt=(this.vehiclevalue*(this.vehicleAge+this.Insurancetype));
    console.log(this.amt)
  }
  

  ngOnInit(): void {
  }

}
