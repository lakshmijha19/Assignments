class Bank
{
	double balance=0; double amt=0;
	public void totalcash(double amt)
	{
		balance=amt;
		System.out.println(balance);
	}
}

class Savings extends Bank
{
	double interest;
	
	public double fixedDeposit(double in)
	{
		interest=(in/12);
		return interest;
	}
	
	public void totalcash(double amt)
	{
		balance=balance+(amt*interest);
		System.out.println(balance);
	}
	
	
}

class Current extends Bank
{
	double cc=0;
	
	public double cashcredit(double credit)
	{
		cc= cc+credit;
		return cc;
	}
	
	public void totalcash(double amt)
	{
		balance=amt+cc;
		System.out.println(balance);
	}
	
}


public class Cash {
	
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.totalcash(500000.0);
		
		Savings s=new Savings();
		s.fixedDeposit(50000.0);
		s.totalcash(50000.0);
		
		Current c=new Current();
		c.cashcredit(50000.0);
		c.totalcash(500000.0);
	}

}
