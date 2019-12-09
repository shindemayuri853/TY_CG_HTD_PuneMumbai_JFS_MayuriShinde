import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginResponse } from './login_response';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn(): boolean {
    const user: LoginResponse = JSON.parse(localStorage.getItem('token'));
    if (user && user.registered) {
      return true;
    } else {
      return false;
    }
  }

  constructor(private http: HttpClient) { }
register(data) {
  return this.http.post('https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyDCgZ6F--WRAXjyFPzs8i8bINXNM1EtuJY',
  {...data, returnSecureToken : true});
}

login(data: LoginResponse) {
  // tslint:disable-next-line: max-line-length
  return this.http.put<LoginResponse>('https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyDCgZ6F--WRAXjyFPzs8i8bINXNM1EtuJY',
   {...data, returnSecureToken: true});
}

}
