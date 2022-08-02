import { DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLinkWithHref } from '@angular/router';
import { PolicyHttpClientService } from 'src/app/Service/Policy/policy-http-client.service';
import { TicketHttpClientService } from 'src/app/Service/Ticket/ticket-http-client.service';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';
import { VehicleHttpClientService } from 'src/app/Service/Vehicle/vehicle-http-client.service';

@Component({
  selector: 'app-viewinsurance',
  templateUrl: './viewinsurance.component.html',
  styleUrls: ['./viewinsurance.component.css']
})
export class ViewinsuranceComponent implements OnInit {
  policyList: any;
  todayDate:Date=new Date();
  policyExpire: any;
  vehicleList:any;
  ticketList:any;

  constructor(private ticketSer:TicketHttpClientService,private vechSer:VehicleHttpClientService, private userSer:UserHttpClientService, private router:Router,private datePipe: DatePipe,private policySer:PolicyHttpClientService) { }

  ngOnInit(): void {
    
    
  
    const userId = {
      
      "Id": sessionStorage.getItem('userId')
    
  }
  this.userSer.getPolicyList(userId).subscribe(
    response=>{
      this.policyList=response;
    
      
  })
  this.vechSer.getVehicleList(userId).subscribe(
    response=>{
      this.vehicleList=response;
   
      
  })

  this.ticketSer.getTicketList(userId).subscribe(
    response=>{
      this.ticketList=response;
    console.log(this.ticketList);
      
  })
      
    
    }

    checkDate(expire:Date,p:any){
      const expiredate=new Date(expire)
      if(p.policyType!="travel"){
      if(this.todayDate.getTime()>expiredate.getTime()){
        this.renew(p);
      }
      else
      {
        alert("Policy Not Expired")
      }}
      else{
        alert("Travel Policy cannot be renewed");
      }
    
      // let expireyear =Number(this.datePipe.transform(expire, 'yyyy'));
      // let todayyear =Number(this.datePipe.transform(this.todayDate, 'yyyy'));

      // let expiremonth =Number(this.datePipe.transform(expire, 'MM'));
      // let todaymonth =Number(this.datePipe.transform(this.todayDate, 'MM'));

      // let expireday =Number(this.datePipe.transform(expire, 'dd'));
      // let todayday =Number(this.datePipe.transform(this.todayDate, 'dd'));
      // console.log(expireday,expiremonth,expireyear,todayday,todaymonth,todayyear)
      // if((expireyear<todayyear))

      // {
      //   if(expiremonth<todaymonth || expiremonth==todaymonth)
      //   {
      //     if(expireday<todayday || expireday==todayday)
      //     {
      //       console.log("expired")
      //     }
      //   }
        
      // }
      // else
      // {
      //   alert("Policy not expired")
      // }

        
    }

    renew(p:any)
    {
      delete p.policyExpire;

      var d = new Date();
      var year = d.getFullYear();
      var month = d.getMonth();
      var day = d.getDate();
      this.policyExpire=new Date(year + 1, month, day);
      this.policyExpire = this.datePipe.transform(this.policyExpire, 'yyyy-MM-dd');


      const toAppend = {
        "policyExpire":this.policyExpire
      }

      const temp = { ...toAppend, ...p };
      console.log(temp)
      this.policySer.policyUpdate(temp).subscribe(
        response=>
        {       console.log(response);
                alert("Policy Renewed.")
                window.location.reload(); 
        },
        err=>{
            alert("user exists")
          });
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


