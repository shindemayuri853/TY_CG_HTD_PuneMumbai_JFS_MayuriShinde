let myName='Mayuri';
// myName=1235; error because we can not change datatype

let company; //implicitely will be considered as any

company=1234;
company='ty';
company=true;

let age:string |number;
age=21;
age='Twenty One'
// age=true; error- only string or number can be used

//tuple
let datails:[string,number,number]=['XYZ',1234,1234];

let mobiles :string[]=['iphone','Samsung','5050'];

function add(a:number,b:number):number{
    return a+b;
}

