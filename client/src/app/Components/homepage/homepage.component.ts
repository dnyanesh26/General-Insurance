import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  authentication(path:String)
  {
    if(sessionStorage.getItem('userId')!=null)
    {
      this.router.navigate([path]); 
    }
    else
    {
      this.router.navigate(['login']);
    }

  }

}
