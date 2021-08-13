import java.util.*;

public class OddLength {

	public static void main(String args[])
	{
		
		ArrayList<String> l= new ArrayList<String>();
		l.add("Lakshmi");
		l.add("Chiranjeet");
		l.add("Shubhangi");
		l.add("Raj");
		l.add("Sneha");
		l.add("Pradip");
		
		l.removeIf(r-> r.length()%2!=0);
		System.out.println(l);
		
		
	}
}
