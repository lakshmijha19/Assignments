import java.util.*;

public class Pair<K,V>{

	K key;
	V value;
	
	Pair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	K getKey()
	{
		return key;
	}
	
	V getValue()
	{
		return value;
	}
	
	public static void main(String args[])
	{
		Pair<String, String> p1 = new Pair<String, String>("Key:","Value");
		
		System.out.println(p1.getKey() + p1.getValue());
		
		
		Pair<String, Date> p2 = new Pair<String, Date>("Date:",new java.util.Date());
		
		System.out.println(p2.getKey() + p2.getValue());
	}
}

