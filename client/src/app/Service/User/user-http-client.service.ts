import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from 'src/app/Components/register/User';

@Injectable({
  providedIn: 'root'
})
export class UserHttpClientService {
 

  baseUrl="http://localhost:8090/user-api";

  constructor(private http:HttpClient) { }

  public regUser() {
    return this.http.post<User>(this.baseUrl+'/addUser',{responseType:'text'})
  }
}
