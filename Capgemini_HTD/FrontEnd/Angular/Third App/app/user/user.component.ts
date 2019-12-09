import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http'

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user=[];

  constructor(http: HttpClient) {
    http.get<any>('../../assets/user.json').subscribe(data=>{
      console.log(data);
      this.user=data;
    }, err=>{
      console.log(err);
    });
   }

  ngOnInit() {
  }

}
