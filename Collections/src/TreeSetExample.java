import java.util.*;

class Employee
{
	int id;
	String name;
	String dept;
	int salary;
	
	Employee(int id, String name, String dept, int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String toString()
	{
		return this.id+" : "+this.name+" | "+this.dept+" | "+this.salary;
	}
	
}

class TreeSetExample {
	public static void main(String args[])
	{
		TreeSet<Employee> t= new TreeSet<Employee>(new FirstComparator());
		
		t.add(new Employee(1, "Lakshmi", "Computer Science",20000));
		t.add(new Employee(2, "Sneha", "Data Science",30000));
		t.add(new Employee(3, "Raj", "Data Analytics",25000));
		t.add(new Employee(4, "Shivani", "Mechnical",28000));
		t.add(new Employee(5, "Snehal", "Digital Marketing",36000));
		t.add(new Employee(6, "Rajvi", "Information Technology",45000));
		t.add(new Employee(7, "Aditi", "Electronics",40000));
		t.add(new Employee(8, "Zuhi", "Data Engineering",38000));
		t.add(new Employee(9, "Zinal", "Commerce",23000));
		
		
	TreeSet<Employee> t2= new TreeSet<Employee>(new SecondComparator());
		
		t2.add(new Employee(1, "Lakshmi", "Computer Science",20000));
		t2.add(new Employee(2, "Sneha", "Data Science",30000));
		t2.add(new Employee(3, "Raj", "Data Analytics",25000));
		t2.add(new Employee(4, "Shivani", "Mechnical",28000));
		t2.add(new Employee(5, "Snehal", "Digital Marketing",36000));
		t2.add(new Employee(6, "Rajvi", "Information Technology",45000));
		t2.add(new Employee(7, "Aditi", "Electronics",40000));
		t2.add(new Employee(8, "Zuhi", "Data Engineering",38000));
		t2.add(new Employee(9, "Zinal", "Commerce",23000));
		
		
TreeSet<Employee> t3= new TreeSet<Employee>(new ThirdComparator());
		
		t3.add(new Employee(1, "Lakshmi", "Computer Science",20000));
		t3.add(new Employee(2, "Sneha", "Data Science",30000));
		t3.add(new Employee(3, "Raj", "Data Analytics",25000));
		t3.add(new Employee(4, "Shivani", "Mechnical",28000));
		t3.add(new Employee(5, "Snehal", "Digital Marketing",36000));
		t3.add(new Employee(6, "Rajvi", "Information Technology",45000));
		t3.add(new Employee(7, "Aditi", "Electronics",40000));
		t3.add(new Employee(8, "Zuhi", "Data Engineering",38000));
		t3.add(new Employee(9, "Zinal", "Commerce",23000));
			
		
TreeSet<Employee> t4= new TreeSet<Employee>(new FourthComparator());
		
		t4.add(new Employee(1, "Lakshmi", "Computer Science",20000));
		t4.add(new Employee(2, "Sneha", "Data Science",30000));
		t4.add(new Employee(3, "Raj", "Data Analytics",25000));
		t4.add(new Employee(4, "Shivani", "Mechnical",28000));
		t4.add(new Employee(5, "Snehal", "Digital Marketing",36000));
		t4.add(new Employee(6, "Rajvi", "Information Technology",45000));
		t4.add(new Employee(7, "Aditi", "Electronics",40000));
		t4.add(new Employee(8, "Zuhi", "Data Engineering",38000));
		t4.add(new Employee(9, "Zinal", "Commerce",23000));
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Run Application : ");
		System.out.println("--------------------");
		System.out.println("(a) : ID");
		System.out.println("(b) : Name");
		System.out.println("(c) : Department");
		System.out.println("(d) : Salary");
		System.out.println("--------------------");
		System.out.println("Your Choice: ");
		
		String input=sc.nextLine();
		
		if (input.equals("a"))
		{
			for(Employee e: t)
			{
				System.out.println(e);
			}
		}
		
		else if (input.equals("b"))
		{
			for(Employee e: t2)
			{
				System.out.println(e);
			}
		}
		
		else if (input.equals("c"))
		{
			for(Employee e: t3)
			{
				System.out.println(e);
			}
		}
		
		else if (input.equals("d"))
		{
			for(Employee e: t4)
			{
				System.out.println(e);
			}
		}
		sc.close();
	}

}

class FirstComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		if (e1.id<e2.id)
		{
			return -1;
		}
		
		else if (e1.id>e2.id)
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
	}
}

class SecondComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return (e1.name).compareTo(e2.name);
	}
}

class ThirdComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return (e1.dept).compareTo(e2.dept);
	}
}

class FourthComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		if (e1.salary<e2.salary)
		{
			return -1;
		}
		
		else if (e1.salary>e2.salary)
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
	}
}
