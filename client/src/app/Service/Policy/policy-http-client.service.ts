import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PolicyComponent } from 'src/app/Components/policy/policy.component';

@Injectable({
  providedIn: 'root'
})

export class PolicyHttpClientService {
  
  
  
  getPolicyList() {
    throw new Error('Method not implemented.');
  }

  baseUrl="http://localhost:8090/policy-api";
  

  constructor(private http:HttpClient) { }

// -------------------------------------------------------
  policyReg(policy: any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'

    }
   
    return this.http.post<any>(this.baseUrl+'/addPolicy',policy,requestOptions)
  }
// -------------------------------------------------------
  policyUpdate(p: any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'

    }
    return this.http.put<any>(this.baseUrl+'/updatePolicy',p,requestOptions)
    
  }
// -------------------------------------------------------
  deletePolicy(p: any) {

    // const requestOptions: Object = {
    //   /* other options here */
    //   responseType: 'text'

    // }
    let HTTPOptions:Object = {

      headers: new HttpHeaders({
        'policyNo':String(p.policyNo),
        'Content-Type': 'application/json'
      }),
      responseType: 'text'
   }
    

    return this.http.delete<string>(this.baseUrl+'/deletePolicy',HTTPOptions)
    
    
  }
  
  
}
