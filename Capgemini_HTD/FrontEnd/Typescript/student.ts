class Student{
    constructor(
        public name: string,
        public age: number,
        public marks: number,
        public degree ?: string){ //optional parameter

        }
        // printDetails(){
        //     console.log(`Name is ${this.name}  age is ${this.age} and marks is ${this.marks}`);
        // }
}

// let student1= new Student('Priya',25,99);
// console.log(student1);
// student1.printDetails();

let student2: Student={
    name: 'MAyuri',
    age: 21,
    marks: 99
}
console.log(student2);

let students: Student[]=[
    new Student('Rohit',299,12),
    {
        name: 'Hrishi',
        marks: 250,
        age: 13
    },
    student2,
    
];
for(let student of students){
    console.log(student);
}

class Graduate extends Student{
    
}

