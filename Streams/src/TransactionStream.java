import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transaction
{
	Trader trader;
	int year;
	int value;
	
	Transaction(Trader trader,int year, int value)
	{
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year) 
	{
        this.year = year; 
    }
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value) 
	{
        this.value = value; 
    }
	
	@Override
    public String toString() {
        return "Transaction [" + trader + ", Year=" + year + ", Value=" + value  + "]";
}
}

public class TransactionStream {
	
	public static void main(String args[])
	{
		Trader t1 = new Trader("Lakshmi","Delhi");
		Trader t2 = new Trader("Sneha","Pune");
		Trader t3 = new Trader("Aditi","Indore");
		Trader t4 = new Trader("Raj","Pune");
		Trader t5 = new Trader("Sonal","Pune");
		Trader t6 = new Trader("Gayatri","Indore");
		Trader t7 = new Trader("Pradeep","Pune");
		
		ArrayList<Transaction> a = new ArrayList<Transaction>();
		a.add(new Transaction(t1,2011,15000));
		a.add(new Transaction(t2,2012,19000));
		a.add(new Transaction(t3,2011,10500));
		a.add(new Transaction(t4,2019,19000));
		a.add(new Transaction(t5,2018,20000));
		a.add(new Transaction(t6,2011,15000));
		a.add(new Transaction(t7,2016,22000));
		
		List<Transaction> y = a.stream().filter(c->c.year==2011).
				sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		
		System.out.println(y);
		
		Transaction max = a.stream().max(Comparator.comparing(Transaction::getValue)).get();
		
		System.out.println(max);
		
		Transaction min = a.stream().min(Comparator.comparing(Transaction::getValue)).get();
		
		System.out.println(min);
		
		List<Transaction> d= a.stream().filter(c-> c.trader.getCity().equals("Delhi")).collect(Collectors.toList());
		
		System.out.println(d);
	}

}
