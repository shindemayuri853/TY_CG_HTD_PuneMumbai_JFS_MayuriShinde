let myString='Capgemini trainee are really intelligent';
console.log(myString.indexOf('are'));

console.log(myString.includes('train')); //search for word

let reveresedString=myString.split();    //there no reverse method present for String there is method called as split then it will put it into array
console.log(reveresedString);

let stringChar=myString.split('');  //will give individual charecter
console.log(stringChar); 

var reverse=myString.split('').reverse(); //reverse char
console.log(reverse);

var reversed=myString.split('').reverse().join(''); //reverse String
console.log(reversed);

console.log(myString.charAt(2));

console.log(myString.charCodeAt(1)); // will give ASCII value
