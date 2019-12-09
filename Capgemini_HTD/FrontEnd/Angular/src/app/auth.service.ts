import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  api = 'http://localhost:8080/users/';

  constructor(private http: HttpClient) { }

  isLoggedIn() {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.registered) {
      return true;
    } else {
      return false;
    }
  }

  register(user): Observable<any> {
    return this.http.post(`${this.api}register`, user);
  }

  login(credentials): Observable<any>{
    return this.http.post(`${this.api}login`, credentials);
  }

}
