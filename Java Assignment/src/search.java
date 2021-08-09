import java.util.Scanner;
public class search {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int[] bs= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter Value to be search in array: ");
		int value=sc.nextInt();
		for(int i=0;i<15;i++)
		{
			if(value==bs[i])
			{
				System.out.println("Search Value is present at index: "+i);
				break;
			}
		}
		sc.close();
	}

}
