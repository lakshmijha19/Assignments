import java.util.*;
import java.time.LocalDate;

class LinkedListExample {

	public static void main(String[] args)
	{
		LocalDate d1=LocalDate.of(1997, 10, 19);
		LocalDate d2=LocalDate.of(2002, 01, 19);
		LocalDate d3=LocalDate.of(2004, 12, 04);
		LocalDate d4=LocalDate.of(1998, 02, 03);
		
		LinkedList<Object> o = new LinkedList<Object>();
		o.add(d1);
		o.add(d2);
		o.add(d3);
		o.add(d4);
		
		for(Object i: o)
		{
			int y= ((LocalDate) i).getYear();
			
			if (((y % 4 == 0) && (y % 100!= 0)) || (y % 400 == 0))
		         System.out.println("Your Date of Birth : "+((LocalDate)i)+" It was a Leap Year.");
		    else
		    	 System.out.println("Your Date of Birth : "+((LocalDate)i)+" It was a not Leap Year.");
		}
	
	}
	
}
