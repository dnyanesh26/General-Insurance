import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  baseUrl="http://localhost:8090/ticket-api";

  constructor(private http:HttpClient) { }
}
