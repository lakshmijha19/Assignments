import java.util.ArrayList;

interface Interf
{
	 int tryadd(int v1, int v2);
}

class notVar {

	// Scenerio:3 -> Cannot be use as Global Variable.
	var var3 =3;
	
	// Scenerio:5 -> Cannot be use as Method Return Type.
	var method1()
	{
		System.out.println("Inside a method!");
	}
	
	// Scenerio:6 -> Cannot be use as Method Parameters.
	void method2(var var5)
	{
		System.out.println(var5);
	}
	
	public static void main(String args[])
	{
		// Scenerio:1 -> Cannot initialised var as null.
		var var1 = null;
		
		
		// Scenerio:2 -> An initializer is required on right side of var.
		var var2;
		
		var2 = "Lakshmi";
		var2 = 3;
		
		// Scenerio:4 -> Cannot be use with Lambda Expressions.
		var var4 = (v1,v2) -> (v1+v2);
		System.out.println(var4.tryadd(2,3));
		
	}
}
