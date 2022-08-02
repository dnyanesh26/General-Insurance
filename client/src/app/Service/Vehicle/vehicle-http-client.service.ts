import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VehicleHttpClientService {
  getVechileList(userId: { Id: string | null; }) {
    throw new Error('Method not implemented.');
  }
  
  baseUrl="http://localhost:8090/vehicle-api";

  constructor(private http:HttpClient) { }

  regVeh(value: any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'

    }
    const toAppend = {
      "user": {
        "userId": sessionStorage.getItem('userId')
      },
    }
    const vech = { ...toAppend, ...value };
    return this.http.post<any>(this.baseUrl+'/addVehicle',vech,requestOptions)
  }
  getVehicleList(userId:any) {
    return this.http.post<any>(this.baseUrl+'/vehicle',userId);
  }
}
