@FunctionalInterface
interface Interf
{
	public abstract int operations(int a,int b);
}

public class ArithmeticOperations {
	
	public static void main(String args[])
	{
		Interf i1 = (a,b) -> a+b;
		System.out.println("Addition : "+ i1.operations(20, 10));
		
		Interf i2 = (a,b) -> a-b;
		System.out.println("Subraction : "+ i2.operations(20, 10));
		
		Interf i3 = (a,b) -> a*b;
		System.out.println("Multiplication : "+ i3.operations(20, 10));
		
		Interf i4 = (a,b) -> a/b;
		System.out.println("Division : "+ i4.operations(20, 10));
	}
}
