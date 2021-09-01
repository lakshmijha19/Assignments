let input = parseInt(prompt("Enter number: "));
let sum=0;

for(let i=1;i<=input;i++)
{
    if(i%3===0 || i%5===0)
    {
        sum+=i;
    }
}
document.write("Sum is: "+sum);