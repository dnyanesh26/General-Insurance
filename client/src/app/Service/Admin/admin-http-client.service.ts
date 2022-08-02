import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminHttpClientService {
  
  
  
  baseUrl="http://localhost:8090/admin-api";
  constructor(private http:HttpClient) { }

  loginAdmin(email: any) {
    let HTTPOptions:Object = {

      headers: new HttpHeaders({
        'userName':email,
        'Content-Type': 'application/json'
      }),
      // responseType: 'text'
   }
    return this.http.get<any>(this.baseUrl+'/admin',HTTPOptions)
  }

  getTicketList() {
    return this.http.get<any>(this.baseUrl+'/ticket')
  }
  getVehicleList() {
    return this.http.get<any>(this.baseUrl+'/vehicle')
  }
  getPolicyList() {
    return this.http.get<any>(this.baseUrl+'/policy')
  }
  getClaimList() {
    return this.http.get<any>(this.baseUrl+'/claim')
  }
  appClaim(Fclaim: any) {
    return this.http.put<any>(this.baseUrl+'/appClaim',Fclaim)
  }
}
