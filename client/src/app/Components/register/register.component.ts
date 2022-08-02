
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { catchError } from 'rxjs';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';

import { User } from './User';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


    user:User[]=[]  
    regform:any;
    regForm:FormGroup;
    
  constructor(private fb: FormBuilder, private router: Router,private userSer: UserHttpClientService) { 
    

    this.regForm = new FormGroup({
      name: new FormControl('',[Validators.required]),
      email: new FormControl('',[Validators.email,Validators.required]),
      dob: new FormControl('',[Validators.required]),
      contactNo: new FormControl('',[Validators.required,Validators.maxLength(10)]),
      address: new FormControl('',[Validators.required]),
      password: new FormControl('',[Validators.required,Validators.maxLength(9)]),
      repeatPassword: new FormControl('',[Validators.required])
    });
  }
  get name(){
    return this.regForm.get('name');
  }
  get email(){
  return this.regForm.get('email');
  }
  get dob(){
    return this.regForm.get('dob');
  }
  get contactNo(){
    return this.regForm.get('contactNo');
  }
  get address(){
    return this.regForm.get('address');
  }
  get password(){
    return this.regForm.get('password');
  }
  get repeatPassword(){
    return this.regForm.get('repeatPassword');
    }


  ngOnInit(): void {
  }

  onSubmit(value:string): void {
    
    if(this.regForm.value.password==this.regForm.value.repeatPassword){
      delete this.regForm.value.repeatPassword;
      
      
      this.regform=this.regForm.value;

     
      this.userSer.regUser(this.regform).subscribe(
        response=>
        {       this.user=response;
                alert("user registered. Please Login")
                this.router.navigate(['login']); 
        },
        err=>{
            alert("user exists")
          });
          this.router.navigate(['']); 
 
    }
    else{
      alert("Please enter both passwords correctly.")
    }
  }
}

  


