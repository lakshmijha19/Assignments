import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)  

@interface Info
{
	int AuthorID();
	String Date();
	String Time();
	int version();
}

@Info(AuthorID=1001, Date="11-08-2021", Time="10:11", version=3)
class Information
{
	String name;
	String sup;
	String description;
	
	Information(String name, String sup, String description)
	{
		this.name=name;
		this.sup=sup;
		this.description=description;
	}
}

public class CustomAnnotation2 {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		Information i= new Information("Author Name: Lakshmi ", "Supervisor: S."," Information of Author");
		System.out.println(i.name+" | "+i.sup+" | "+i.description);
		
		Class c= i.getClass();
		Annotation a= c.getAnnotation(Info.class);
		Info f=(Info)a;
		
		System.out.println(f.Date()+" | "+f.Time()+" | "+f.AuthorID()+" | "+f.version());
		
	}

}
