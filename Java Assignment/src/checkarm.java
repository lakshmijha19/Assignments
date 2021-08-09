
public class checkarm {
      public static void main (String args[])
      {
    	  int n=100;
    	  int arm;
    	  System.out.println("Armstrong number from 100 to 999");
    	  while (n<1000)
    	  {
    		  arm = armstrong(n);
    		  if(arm==n)
    		  {
    			  System.out.println(n);
    		  }
    		  n++;
    	  }
    	  
      }
      static int armstrong(int num)
      {
    	  int temp, sum= 0;
    	  while (num != 0)
    	  {
    		  temp = num % 10;
    		  sum = sum + (temp*temp*temp);
    		  num = num / 10;
    	  }
    	  return sum;
      }
}
