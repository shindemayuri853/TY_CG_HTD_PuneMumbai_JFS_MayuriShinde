//Anonymous Function with Expression
var x=function(){
    console.log('Hello from Anonymous Function');
    document.write('Hello from Anonymous Function');
}
// Callinh a Anonymous Function
x();

//naming Function
function add(a,b){
    console.log(a+b);
}
//Calling naming function
add(10,2);

var m=10;
var n=50;
console.log(m+n);
console.log(m*n);

(function(x,y){
    console.log('Hello');
    console.log('The Addition is', x+y); 
})(1234,567)

//Understanding return keyword
function division(a,b){
    return a/b;
}
console.log(division(10,2));