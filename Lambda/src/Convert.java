import java.util.*;

public class Convert {
	
	public static void main(String args[])
	{
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(1001, "Lakshmi");
		m.put(1002, "Sneha");
		m.put(1003, "Raj");
		
		StringBuffer sb= new StringBuffer();
		
		for(Map.Entry<Integer, String> map: m.entrySet())
		{
			sb.append(map.getKey()+" : ");
			sb.append(map.getValue()+"\t");
		}
		
		System.out.println(sb);
	}

}
