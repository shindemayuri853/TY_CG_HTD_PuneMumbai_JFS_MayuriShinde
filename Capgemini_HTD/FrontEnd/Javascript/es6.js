let person={
    name:'Kajal',
    age:36
};

let student={
    ...person,
    id:1234,
    percentage:78
};

console.log(student);


let mumbaiCRs =['Akash','Aishwarya'];
let noidaCRs =['Kartik','Monali'];
let BangloreCRs=['Yasim','Shahid'];
let bhuvneshwarCRs=['Kaushik','Nisha'];
let CRs=[
    ...mumbaiCRs,
    ...noidaCRs,
    ...BangloreCRs,
    ...bhuvneshwarCRs,
    'subrat'   //to add name outside array
];

console.log(CRs);

//to get only required value
// let[name1,name2,name3]=CRs;
// console.log(name1);
// console.log(name2);
// console.log(name3);

//to get requires + remaining all values
let[name1,name2,name3,...restValue]=CRs;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValue);

let idiots={
    name:'Aamir',
    name:'Kareena',
    };
    let uri={
        name:'Vicky',
        name:'Mayuri'
    };
    let names={
        
    }