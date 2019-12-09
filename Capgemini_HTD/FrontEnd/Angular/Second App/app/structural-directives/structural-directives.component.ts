import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  person= 'Mayuri';
  flag= false;
  student: Student[]=[
    {id: 1234,
    name: 'Mayuri',
    age: 21,
  degree: 'BE'},
  { id: 1235,
    name: 'Pranjali',
    age: 25,
    degree: 'BE'},
    {id: 1236,
      name: 'Chetna',
      age: 22,
      degree: 'BE'
    },
    {id: 1237,
      name: 'Smita',
      age: 21,
      degree: 'BCom'
    },
    {id: 1238,
      name: 'Rakhita',
      age: 22,
      degree: 'MBA'
    }
  ]


  constructor() {
    setTimeout(()=>{
      this.flag=true;
    },1000)
   }

   deleteStudent(student: Student){
     const index = this.student.indexOf(student);
     this.student.splice(index,1);
   }

  ngOnInit() {
  }

}
