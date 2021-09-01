let a = 1, b = 1;  
let num=100;
let result;
console.log(`Fibonacci Series of ${num}  terms  is: ` );  

console.log ("  " + a);

for ( let i =2; i < num; i++)  
{  
    console.log ("  " + b);
    result = a + b;  
    a = b;  
    b = result;  
}  

console.log( "" + "<br>");  