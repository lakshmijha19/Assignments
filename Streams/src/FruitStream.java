import java.util.stream.*;
import java.util.*;

class Fruit 
{
	String name;
	int calories;
	int price;
	String color;
	
	Fruit(String name,int calories, int price, String color)
	{
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
        this.name = name; 
    }
	
	public int getCalories()
	{
		return calories;
	}
	
	public void setCalories(int calories) 
	{
        this.calories = calories; 
    }
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
        this.price = price; 
    }
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color) 
	{
        this.color = color; 
    }
	
	 @Override
	    public String toString() {
	        return "Fruit [Name=" + name + ", Calories=" + calories + ", Price=" + price +", Color=" + color + "]";
	    }
}


public class FruitStream {
 
	public static void main(String[] args)
	{
		ArrayList<Fruit> f=new ArrayList<Fruit>();
		f.add(new Fruit("Apple",55, 600, "Red"));
		f.add(new Fruit("Banana",100, 150, "Yellow"));
		f.add(new Fruit("Graphes",95, 500, "Green"));
		f.add(new Fruit("Pomogramte",70, 800, "Red"));
		f.add(new Fruit("Mango",120, 950, "Yellow"));
		
		f.stream().filter(c->c.calories<100).forEach(c->System.out.println(c.name));
		
		List<Fruit> fname= f.stream().sorted(Comparator.comparing(Fruit::getColor)).
				collect(Collectors.toList());
		
		fname.forEach(System.out::println);
		
		List<Fruit> red = f.stream().filter(r-> r.color=="Red").sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		
		red.forEach(System.out::println);
	}
}
