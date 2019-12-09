//literal way of object creation
var student={
    name:'Rohit Shinde',
    age:24,
    degree:'BE',
    phoneNumber:9969194535
};

console.log(student.name);
console.log(student);

student.phoneNumber=123456789;
console.log(student.phoneNumber);

student.company='capgemini';
console.log(student);

//using object constructor
var laptop=new Object();
laptop.brand='hp';
laptop.ram='8GB';
laptop.processor='core i3';
laptop.price=32999;

console.log(laptop);

console.log(Object.keys(laptop).length);

