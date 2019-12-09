import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  api = 'https://mayuri-angular.firebaseio.com/';
  employee: Employee[] = [];

  constructor(private http: HttpClient) { }

  postData(data) {
    return this.http.post(`${this.api}employee.json`, data);
  }
  getData() {
    this.http.get(`${this.api}employee.json`).subscribe(data => {
      console.log(data);
      const employeeArray = [];
      for (const key in data) {
        if (data.hasOwnProperty(key)) {
          employeeArray.push({...data[key], pk: key});
        }
      }
      this.employee = employeeArray;
      console.log(this.employee);
    });
  }

  deleteData(data) {
    return this.http.delete(`${this.api}employee/${data.pk}.json`);
  }

  putData(data) {
    return this.http.put(`${this.api}employee/${data.pk}.json`, data);
  }
}
