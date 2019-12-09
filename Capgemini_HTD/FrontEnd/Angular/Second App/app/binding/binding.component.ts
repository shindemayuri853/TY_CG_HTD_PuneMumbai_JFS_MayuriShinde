import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  flag= true;
  name= 'Mayuri';
  imgURL= 'https://cdn.pixabay.com/photo/2019/10/18/05/51/mountain-4558300__340.jpg';

  constructor() { 
    setInterval(()=> {
      this.flag =! this.flag;
    },1000)
  }
 
  eventOccurred(myInput){
    console.log(myInput);
    console.log('Key up event has started');
  }

  ngOnInit() {
  }

}
