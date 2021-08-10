import java.util.*;

public class HashSetExample {
	
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		
		HashSet<String> h= new HashSet<String>();
		
		for(int counter=1; counter<=10; counter++)
		{
			System.out.println("Product Object "+counter+" : ");
			String product=sc.nextLine();
			h.add(product);
			
		}
		System.out.println(h);
		sc.close();
	}
	
	

}
