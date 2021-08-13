import java.util.*;
import java.util.function.UnaryOperator;

class Operator implements UnaryOperator<String>
{
	public String apply(String s)
	{
		return s.toUpperCase();
	}
}
class ReplaceAll {
	
	public static void main(String args[])
	{
		ArrayList<String> l= new ArrayList<String>();
		l.add("String : 1");
		l.add("String : 2");
		l.add("String : 3");
		
		System.out.println("Contents of the List: In Normal Format");
		System.out.println("------------------------------------------");
		System.out.println(l);
		
		System.out.println();
		
		l.replaceAll(new Operator());
		
		System.out.println("Contents of the List: In UpperCase Format");
		System.out.println("------------------------------------------");
		System.out.println(l);
	}

}
