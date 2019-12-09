import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
// import { Observable } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: AuthService) { }

  register(registerForm: NgForm) {
    this.auth.register(registerForm.value).subscribe(response => {
      console.log(response);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
