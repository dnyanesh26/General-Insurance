import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  authentication(link:any){

    if(sessionStorage.getItem('adminId')!=null){
      this.router.navigate(['admin/'+link]); 
    }
    else 
    if(sessionStorage.getItem('userId')!=null){
      this.router.navigate([link])
    }
    else
    {
      this.router.navigate(['login'])
    }

  }
  reglog(link:any){
    if(sessionStorage.getItem('adminId')!=null || sessionStorage.getItem('userId')!=null)
    {
      alert('Please Logout')
    }
    else{
      this.router.navigate([link])
    }
  }

  logout(){
    if(sessionStorage.getItem('adminId')!=null || sessionStorage.getItem('userId')!=null){
      sessionStorage.clear();
      
      this.router.navigate([''])
    }
    else{
      alert('Please Login')
    }
  }

}
