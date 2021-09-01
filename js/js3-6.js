var str = '({"firstName":"Lakshmi","lastName":"Jha"})';

var obj = eval(str);

console.log(obj.firstName); 
console.log(obj.middleName); 
console.log(obj.middleName="Kamlesh"); 
console.log(obj.middleName); 