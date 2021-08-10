import java.util.*;

enum Gender
{
    MALE, FEMALE;
}

class Contact
{
	String name;
	String email;
	Gender g;

	Contact (String name, String email, Gender g)
	{
		this.name=name;
		this.email=email;
		this.g=g;
	}
}

class TreeMapExample {
	
	public static void main(String args[])
	{
		TreeMap <Long,Contact> m= new TreeMap <Long,Contact>(Collections.reverseOrder());
		
		Contact c1=new Contact("Lakshmi", "lakshmijha19@gmail.com",Gender.FEMALE);
		Contact c2=new Contact("Sneha", "snehajha191@gmail.com", Gender.FEMALE);
		Contact c3=new Contact("Raj", "rajjha412@gmail.com",Gender.MALE);
		
		m.put(7600594115L, c1);
		m.put(6355173483L, c2);
		m.put(9924370678L, c3);
		
		
		System.out.println("TreeMap Keys:");
		System.out.println("--------------");
		
		for(Map.Entry<Long, Contact> map: m.entrySet())
		{
			System.out.println(map.getKey());
		}
		System.out.println("");
		
		System.out.println("TreeMap Values:");
		System.out.println("-----------------");
		
		for(Map.Entry<Long, Contact> map: m.entrySet())
		{
			Contact c=map.getValue();
			System.out.println(c.name+" | "+c.email+" | "+c.g);
		}
		System.out.println("");
		
		System.out.println("TreeMap Keys & Values:");
		System.out.println("------------------------");
		
		for(Map.Entry<Long, Contact> map: m.entrySet())
		{
			Contact c=map.getValue();
			System.out.print(map.getKey()+" : ");
			System.out.println(c.name+" | "+c.email+" | "+c.g);
		}
	}

}
