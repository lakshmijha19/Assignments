import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  

@interface Test
{
	String type();
}
class TestCase
{
   @Test (type="testcase")
   public void methodType()
   {
	   System.out.println("This is a test-case method");
   }
}

class CustomAnnotation {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		TestCase t= new TestCase();
		t.methodType();
		
		Class c= t.getClass();
		Annotation a= c.getAnnotation(Test.class);
		
		Test e = (Test) a;
		System.out.println(e.type());
	}
}
