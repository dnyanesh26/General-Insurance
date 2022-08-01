import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from 'src/app/Components/register/User';

@Injectable({
  providedIn: 'root'
})
export class UserHttpClientService {
  
  
 

  baseUrl="http://localhost:8090/user-api";

  constructor(private http:HttpClient) { }

   regUser(regform:any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'
    }
    return this.http.post<any>(this.baseUrl+'/addUser',regform,requestOptions)
  }


  loginUser(email: any) {
    const requestOptions: Object = {
      /* other options here */
      email:email
    }
    return this.http.post<any>(this.baseUrl+'/user',requestOptions)
  }

  
  getPolicyList(value:any) {
    return this.http.post<any>(this.baseUrl+'/policy',value);
  }
}
