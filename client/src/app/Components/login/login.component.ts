import { ResourceLoader } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';
import { User } from '../register/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User[]=[]  
  loginform:any;
  loginForm:FormGroup;


    constructor(private fb: FormBuilder, private router: Router,private userSer: UserHttpClientService) { 
    

      this.loginForm = new FormGroup({
        
        email: new FormControl(''),
        
        password: new FormControl(''),
       
      });
    }

  ngOnInit(): void {
  }

  onSubmit(value:any){
    
   

     this.userSer.loginUser(value.email).subscribe(
      response=>
      {
        // this.user=response;
        // console.log(this.user);
       
        sessionStorage.setItem('email', response.email);
        sessionStorage.setItem('userId', response.userId);
        this.router.navigate([""]);
       

      },
      err=>
      {
        alert("User not found");
        window.location.reload();

      }
     );


  }

}
