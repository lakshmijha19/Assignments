function pure(arr, f) 
{
    if (f(arr.slice(0, 1)[0])) 
    {
      return arr[0];
    } 
    else 
    {
      arr.shift();
      return pure(arr, f);
    }
  }
  
  function isEven(num) 
  {
    return num % 2 == 0;
  }
  
  console.log(pure([1, 3, 5, 4, 2], isEven));
  

  