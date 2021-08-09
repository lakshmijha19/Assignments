
abstract public class AbstractClass   //  [4.1
{

	public abstract void method1();   //  4.1]
	
	public abstract void method2(); 
	
	public static void main(String args[])
	{
		AbstractClass ac=new AbstractClass(); // 4.2
	}
}

// 4.3

abstract class AbstractExtend1 extends AbstractClass  
{
	public void method1()
	{
		System.out.println("Overide Abstract Method 1");
	}
}

class AbstractExtend2 extends AbstractExtend1
{
	public void method2()
	{
		System.out.println("Overide Abstract Method 2");
	}
}

//4.4
private abstract class AbstractExtend3 extends AbstractClass  
{
	
}

//4.5
final abstract class AbstractExtend4 extends AbstractClass  
{
	
}

//4.6
abstract class AbstractExample
{
	public void method3()
	{
		
	}
}