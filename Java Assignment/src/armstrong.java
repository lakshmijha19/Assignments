
public class armstrong {
	
	public static void main (String args[])
	{
		int num = 153;
		int temp,sum=0;
		int n = num;
		
		while (n != 0)
		{
			temp = n % 10;
			sum = sum + (temp*temp*temp);
			n = n / 10;		
		}
		if (sum == num)
		{
			System.out.println(num + " is an Armstrong Number");
		}
		else
		{
			System.out.println(num + " is not an Armstrong Number");
		}
	}

}
