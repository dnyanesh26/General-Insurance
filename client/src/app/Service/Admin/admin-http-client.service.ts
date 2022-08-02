import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminHttpClientService {
  
  baseUrl="http://localhost:8090/admin-api";
  constructor(private http:HttpClient) { }

  loginAdmin(email: any) {
    const requestOptions: Object = {
      /* other options here */
      userName:email
    }
    return this.http.get<any>(this.baseUrl+'/addAdmin',requestOptions)
  }
}
