import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TicketHttpClientService {
  
  baseUrl="http://localhost:8090/ticket-api";

  constructor(private http:HttpClient) { }




  regTick(value: any) {

    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'
    }


    const toAppend = {
      "user": {
        "userId": sessionStorage.getItem('userId')
      },
    }

    
    const tick = { ...toAppend, ...value };
    return this.http.post<any>(this.baseUrl+'/addTicket',tick,requestOptions)
  }




  getTicketList(userId: any) {
    return this.http.post<any>(this.baseUrl+'/ticket',userId);
  }
  


}
