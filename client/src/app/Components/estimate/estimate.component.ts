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
<<<<<<< HEAD
    this.amt=(this.vehiclevalue*(this.vehicleAge+this.Insurancetype));
    
=======
    var value=(+this.vehicleAge+ +this.Insurancetype);
    console.log(value);
    this.amt=(this.vehiclevalue*value);
>>>>>>> 4eb714fe0bb38d7b018bcc14b088b7e7b580458c
    console.log(this.amt)
  }
  

  ngOnInit(): void {
  }

}
