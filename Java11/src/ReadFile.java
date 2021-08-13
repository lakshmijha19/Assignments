import java.io.*;
import java.nio.file.Files;

class ReadFile {

	
	public static void main(String args[]) throws Exception
	{
		File file = new File("C:\\Users\\Lakshmi Jha\\Downloads\\StudentList.txt");
      
        
		BufferedReader br = new BufferedReader(new FileReader(file));
		  
		  String line;
		  System.out.println("-----Reading Data From File-----");
		  while ((line = br.readLine()) != null)
		    System.out.println(line);
		  
		  System.out.println("-----After Removing Whitspace From File-----");
		  Files.lines(new File("C:\\Users\\Lakshmi Jha\\Downloads\\StudentList.txt").toPath())
		    .map(s -> s.trim())
		 .filter(s -> !s.isEmpty())
		 .forEach(System.out::println);
		  
		  System.out.println("-----Total Count of Students-----"); 
		 Long count= Files.lines(new File("C:\\Users\\Lakshmi Jha\\Downloads\\StudentList.txt").toPath())
				 .map(s -> s.trim())
				 .filter(s -> !s.isEmpty()).count();
		 
		 System.out.println(count);
	}
}
