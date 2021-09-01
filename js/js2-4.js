function square(x)
{
    return x*x;
}

function map(arr, square )
{
    var newArray=[];

    for(var i=0;i<arr.length;i++)
    {
        newArray.push(square(arr[i]));
    }

    return newArray;
}

console.log(map([1,2,3,4,5],square));
console.log(map([1,2,3,4,5],Math.sqrt));