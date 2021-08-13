import java.util.*;

class Orders
{
	int price;
	String status;
	
	Orders(int price, String status)
	{
		this.price=price;
		this.status=status;
	}
	
	public String toString()
	{
		return "Order : "+status+ " Bill : "+price;
	}
}

public class Order {
	
	public static void main (String[] args)
	{
		ArrayList<Orders> l = new ArrayList<Orders>();
		l.add(new Orders(15000,"ACCEPTED"));
		l.add(new Orders(3000,"ACCEPTED"));
		l.add(new Orders(20000,"NOT ACCEPTED"));
		
		Predicate<Orders> p = (Orders o) -> ((o.price>10000) && (o.status.equals("ACCEPTED")));
		
		for (Orders o1:l)
		{
			if(p.test(o1))
			{
				System.out.println("Order : "+o1.status+ " | Price : "+o1.price);
			}
		}
	}

}
