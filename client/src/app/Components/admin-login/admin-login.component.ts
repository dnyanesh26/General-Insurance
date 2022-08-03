import { Component, OnInit, resolveForwardRef } from '@angular/core';
import { FormBuilder, FormControl, FormGroup,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminHttpClientService } from 'src/app/Service/Admin/admin-http-client.service';
import { UserHttpClientService } from 'src/app/Service/User/user-http-client.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  loginForm: FormGroup;

  constructor(private fb: FormBuilder, private router: Router,private adminSer: AdminHttpClientService) { 
    

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
  
 

   this.adminSer.loginAdmin(value.email).subscribe(
    response=>
    {
      // this.user=response;
      // console.log(this.user);
      console.log(value.password)
      console.log(response.password)
     if(value.password==response.password){
      sessionStorage.setItem('userName', response.userName);
      sessionStorage.setItem('adminId', response.adminId);
      this.router.navigate([""]);
     }
     else
     {
      alert("wrong password")
      // window.location.reload();
     }

    },
    err=>
    {
      console.log(err)
      alert("User not found");
      // window.location.reload();

    }
   );


}

}
