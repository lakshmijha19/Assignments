import java.util.Scanner;
public class incometax {
	static double ctc;
	public static void main(String args[])
	{
		double tax=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter CTC: ");
		ctc = sc.nextDouble();
		if(ctc<=180000)
		{
			tax=0;
		}
		else if(ctc<=300000)
		{
			tax=0.1*(180000);
		}
		
		else if(ctc<=500000)
		{
			tax=(0.2*(ctc-300000))+(0.1*180000);
		}
		else if(ctc<=1000000)
		{
			tax=(0.3*(ctc-500000))+(0.2*200000)+(0.1*180000);
		}
		
		System.out.println("Income tax: "+tax);
		sc.close();
	}

}
