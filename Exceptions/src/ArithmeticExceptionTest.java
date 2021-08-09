import java.lang.ArithmeticException;

public class ArithmeticExceptionTest {
	
	public static void main(String args[])
	{
		int a = 10; int b = 0; int c = 0;
		
		try
		{
			c = a/b;
		}
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exception is handled");
			c = a/2;
		}
		System.out.println(c);
	}

}
