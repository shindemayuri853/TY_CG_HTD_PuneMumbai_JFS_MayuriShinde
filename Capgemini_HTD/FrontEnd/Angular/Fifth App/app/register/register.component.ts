import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
error = null;
  constructor(private auth: AuthService) { }

  registerUser(registerForm: NgForm) {
    this.auth.register(registerForm.value).subscribe(resp => {
      console.log(resp);
      registerForm.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
