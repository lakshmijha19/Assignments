import java.util.*;

public class FirstLetter {

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		l.add("Lakshmi");
		l.add("Kamlesh");
		l.add("Jha");
		
		StringBuffer sb=new StringBuffer("");
		
		Consumer<List<String>> c= list->
		{
			Iterator<String> i = list.iterator();
			while(i.hasNext())
			{
				String s=i.next();
				sb.append(s.charAt(0));
			}
			
		};

		c.accept(l);
		System.out.println(sb);
	}
}
