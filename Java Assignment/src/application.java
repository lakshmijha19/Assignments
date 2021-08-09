import java.util.Scanner;
public class application {
	
	public static void main(String args[])
	{
		String username = "lakshmijha";
		String password = "lakshmi.jha";
		int attempts=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Username: ");
		String user=sc.next();
		System.out.println("Enter Password ");
		String pass=sc.next();
		if(username.equals(user) && password.equals(pass))
		{
			System.out.println("Welcome Lakshmi!");
			break;
		}
		else
		{
			attempts++;
			System.out.println("Invalid Username or Password");
			System.out.println("You have only "+(3-attempts)+" attempts left");
		}
		if(attempts==3)
		{
			System.out.println("Contact Admin");
			break;
		}
		}
		sc.close();
	}

}
