import { ResourceLoader } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
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
        
        email: new FormControl('',[Validators.email,Validators.required]),
        password: new FormControl('',[Validators.required,Validators.maxLength(8)]),
       
      });
    }

    get password(){
      return this.loginForm.get('password');
    }
    get email(){
  return this.loginForm.get('email');
    }

  ngOnInit(): void {
    
  }

  onSubmit(value:any){
    
   
    if(sessionStorage.getItem('adminId')==null){
     this.userSer.loginUser(value.email).subscribe(
      response=>
      {
        // this.user=response;
        // console.log(this.user);
       if(value.password==response.password){
        sessionStorage.setItem('email', response.email);
        sessionStorage.setItem('userId', response.userId);
        this.router.navigate([""]);
       }
       else
       {
        alert("wrong password")
        window.location.reload();
       }

      },
      err=>
      {
        alert("User not found");
        window.location.reload();

      }
     );


  }
  else
  {
    alert("Logout of Admin")
  }
}


}
