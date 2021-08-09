//Singleton Class

public class Singleton {
	
	private static Singleton singletonObject;  //1: private static variable
	
	public String message;
	
	private Singleton()    //2: private constructor
	{
		message="Singleton: ";
	}
	
	public static Singleton getInstance()   //3: public factory method
	{
		if(singletonObject==null)
		{
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

//Since singletonObject is static, it is changed from null to some object. 
//Second time, when we try to call getInstance() method, 
//since singletonObject is not null, then it is returned to the variable, 
//instead of creating new object of SingletonClass.


	public static void main(String args[])
	{
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		Singleton obj4=Singleton.getInstance();
		
		System.out.println(obj1.message +"Object 1");
		System.out.println(obj2.message +"Object 2");
		System.out.println(obj3.message +"Object 3");
		System.out.println(obj4.message +"Object 4");
		
		System.out.println("");
		
		obj3.message = (obj3.message).toUpperCase(); 
		// Changes done only in Object 3
		
		System.out.println(obj1.message +"Object 1");
		System.out.println(obj2.message +"Object 2");
		System.out.println(obj3.message +"Object 3");
		System.out.println(obj4.message +"Object 4");
		
		// Changes is reflected in all Objects.
		// This means that only one object is created in Singleton Class, and
		// All others object point to that one Singleton Object
	}

}

/*

class SingletonInherit extends Singleton
{
	This gives Error: Implicit super constructor test() is not visible for default constructor. Must define an explicit 
 constructor
 
 That means we can restrict child class creation using Singleton.
}

*/
