class Employee 
{
	int salary=0; int ctc=0;
	
	public void getsalary(int ctc)
	{
		salary=salary+(ctc/12);
		System.out.println(salary);
	}
}

class Manager extends Employee
{
	int incentive=0;
	
	public int incentive(int in)
	{
		incentive+=in;
		return incentive;
	}
	public void getsalary(int ctc)
	{
		salary=salary+(ctc/12)+incentive;
		System.out.println(salary);
	}
	
}

class Labour extends Employee
{
	int hours=0;
	public int hours(int hr)
	{
		hours+=hr;
		return hours;
	}
	public void getsalary(int ctc)
	{
		salary=salary+(ctc/12)+(hours*100);
		System.out.println(salary);
	}
}

public class Main
{
	public static void main(String args[])
	{
		Manager m= new Manager();
		m.incentive(15000);
		m.getsalary(300000);	
		
		Labour l=new Labour();
		l.hours(3);
		l.getsalary(300000);
	
		Employee e=new Employee();
		e.getsalary(300000);
	}
}
