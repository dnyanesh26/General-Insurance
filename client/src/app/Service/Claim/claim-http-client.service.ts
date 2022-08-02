import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClaimHttpClientService {
  
  baseUrl="http://localhost:8090/claim-api";
  
  constructor(private http:HttpClient) { }

  regClaim(claim: any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'
  
    }
    return this.http.post<any>(this.baseUrl+'/addClaim',claim,requestOptions);
  }
  getClaimList(userId: any) {
    return this.http.post<any>(this.baseUrl+'/claim',userId);
  }
}
