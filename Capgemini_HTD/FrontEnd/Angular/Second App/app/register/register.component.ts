import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomeValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  get email(){
    return this.registerForm.get(this.email);
  }
  get password(){
    return this.registerForm.get(this.password);
  }

  constructor() { }
  registerForm= new FormGroup({
    email: new FormControl('',[
      Validators.required,
      Validators.email,
      Validators.minLength(8),
      CustomeValidator.noSpace
    ]),
    password: new FormControl('',[
      Validators.required,
      Validators.minLength(8)
    ])
  });

  printForm(Form: NgForm){
    console.log(Form.value);
  }

  ngOnInit() {
  }

}
