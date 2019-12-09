import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  userDetails = JSON.parse(localStorage.getItem('user'));

  constructor(public auth: AuthService) { }

  isAdmin() {
    if (this.userDetails && this.userDetails.role === 'admin') {
      return true;
    } else {
      return false;
    }
  }

  isUser() {
    if (this.userDetails && this.userDetails.role === 'user') {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('user');
  }

  ngOnInit() {
  }

}
