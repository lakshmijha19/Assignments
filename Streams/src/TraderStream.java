import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

class Trader
{
	String name;
	String city;
	
	Trader (String name, String city)
	{
		this.name=name;
		this.city=city;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
        this.name = name; 
    }
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city) 
	{
        this.city = city; 
    }
	
	@Override
    public String toString() {
        return "Trader [Name=" + name + ", City=" + city  + "]";
    }
}

class TraderStream {

	public static void main(String args[])
	{
		ArrayList<Trader> t= new ArrayList<Trader>();
		t.add(new Trader("Lakshmi","Delhi"));
		t.add(new Trader("Sneha","Pune"));
		t.add(new Trader("Aditi","Indore"));
		t.add(new Trader("Raj","Pune"));
		t.add(new Trader("Sonal","Pune"));
		t.add(new Trader("Gayatri","Indore"));
		t.add(new Trader("Pradeep","Pune"));
		
		List<Trader> u = t.stream().filter(distinctByKey(c->c.getCity())).collect(Collectors.toList());
		
		System.out.println(u);
		
		List<Trader> p = t.stream().filter(c->c.city=="Pune").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		
		System.out.println(p);
		
		t.stream().sorted(Comparator.comparing(Trader::getName)).forEach(c->System.out.println(c.name));
		
		List<Trader> i = t.stream().filter(c->c.city=="Indore").collect(Collectors.toList());
		
		System.out.println(i);
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
	  
}
