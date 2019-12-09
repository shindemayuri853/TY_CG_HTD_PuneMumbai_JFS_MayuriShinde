// var x=[1234,'xyz',true,{name: 'vicky Kaushal'}];
// console.log(x[2]);

// for(var i=0; i<x.length; i++){
//     console.log(x[i]);
// }

var color=['Yellow','Green','White','Blue'];
console.log(color);
color.push('Black','Orange');
console.log(color);
color.pop();
console.log(color);
color.shift();
console.log(color);
color.unshift('Purple','Pink');
console.log(color);
color.splice(2,2);
console.log(color);
color.splice(2,0,'Indigo','Indian Black');
console.log(color);
color.splice(2,1,'sky blue','grey');
console.log(color);

// color.forEach(function(value){
//     console.log(value)
// });
// function test(cb){
//     console.log('Test FUNction Started');
//     cb();
//     console.log('Test Ended');

// }

// test(function (){
//     console.log('Callback Started');
// });

// // var i=1;
// // setInterval(function(){
// //     console.log(i);
// //     i++;

// // },1)

// setTimeout(function(){
//     console,log('10 sec done')
// },5000);

// color.forEach(function(value,index,array){
//     console.log(value,index,array);
// });

var myArray=[101,102,103,110,120,152,101,111,103,104,150];
var newArray = myArray.filter(function(value){
    return value>103
});

console.log(newArray);

var x=myArray.filter(function(value,index,array){
    return array.indexOf(value)===index;
});
console.log(x);

if(123=='123')
console.log('true');
else
console.log(false);

if(123==='123')
console.log('true');
else
console.log(false);

// //for of Loop
// for(var x of myArray){
//     console.log(x);
// }

//for in Loop
for(var i in myArray){
    console.log(i);  //Will return index of an array
}

for(var x in myArray){
    console.log('The Value is :'+myArray[x]+ ' index is :'+x);  //Will return value of and index
}

var movie={
    name:'Housefull',
    actor:'Akshay Kumar',
    actress:'Deepika Padukon'
};
console.log(movie['name']);

    for(var m in movie){
        console.log(m +" : " +movie[m]);
    }