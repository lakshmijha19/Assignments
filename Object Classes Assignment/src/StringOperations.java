
public class StringOperations {
	public static void main(String args[])
	{
		String s1=new String();
		s1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		String s2 = s1.toLowerCase();
		System.out.println("toLowerCase() : " + s2);
		
		String s3 = s1.toUpperCase();
		System.out.println("toUpperCase() : " + s3);
		
		String s4 = s1.replace('a','$');
		System.out.println("Replace() : " + s4);
		
		boolean s5 = s1.contains("collection");
		System.out.println("Contains() : " + s5);
		
		String s6=new String();
		s6 = "java string pool refers to collection of Strings which are stored in heap memory";
		
		boolean s7 = (s6.equals(s1));
		System.out.println("Equals() : " + s7);
		
		boolean s8 = (s6.equalsIgnoreCase(s1));
		System.out.println("EqualsIgnoreCase() : " + s8);
	}

}
