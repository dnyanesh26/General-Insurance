
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';
import { User } from './User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  
<<<<<<< HEAD
    regForm!:FormGroup;
    //user:any;
  constructor(private fb: FormBuilder, private router: Router) { }
=======
    regForm:FormGroup;
    
  constructor(private fb: FormBuilder, private router: Router,private userSer: UserHttpClientService) { 
    

    this.regForm = new FormGroup({
      name: new FormControl(''),
      email: new FormControl(''),
      dob: new FormControl(''),
      contactNo: new FormControl(''),
      address: new FormControl(''),
      password: new FormControl(''),
      repeatPassword: new FormControl('')
    });
  }

>>>>>>> 791bf776c5f2b2d6945caed09557b9424ce243d3

  ngOnInit(): void {
  }

  onSubmit(value:string): void {
    console.log(this.regForm.value);
    delete this.regForm.value.repeatPassword;
    console.log(value);
    console.log(this.regForm.value);
    if(this.regForm.value.password==this.regForm.value.repeatPassword){
      // this.user=this.regForm.
      
      // this.user[]=this.regForm.value.name;
      // this.user.email=this.regForm.value.email;
      // this.user.dob=this.regForm.value.dob;
      // this.user.contactNo=this.regForm.value.contactNo;
      // this.user.address=this.regForm.value.address;
      // this.user.password=this.regForm.value.password;

     
      // this.userSer.regUser().subscribe(response=>{this.user=response;
      // })
    }
  }
}

  


