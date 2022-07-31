
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
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
      name: new FormControl(''),
      email: new FormControl(''),
      dob: new FormControl(''),
      contactNo: new FormControl(''),
      address: new FormControl(''),
      password: new FormControl(''),
      repeatPassword: new FormControl('')
    });
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
  }
}

  


