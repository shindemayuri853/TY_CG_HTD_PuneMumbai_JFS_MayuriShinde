import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error = null;

  constructor(private auth: AuthService, private router: Router) { }

  loginUser(form: NgForm) {
    this.auth.login(form.value).subscribe(resp => {
      console.log(resp);
      form.reset();
      if (resp.registered) {
        const user = JSON.stringify(resp);
        localStorage.setItem('token', user);
        this.router.navigateByUrl('/about');
      }
    }, err => {
      console.log(err);
      this.error = err.error.error.message;
      form.reset();
    });
  }

  ngOnInit() {
  }

}
