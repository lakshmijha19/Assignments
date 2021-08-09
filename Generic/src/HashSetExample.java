import java.util.HashSet;

class Employee {

	int id;
	String name;
	int salary;
	String dept;
	
	Employee(int id, String name, int salary, String dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
}

class HashSetExample
{
	public static void main(String args[])
	{
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e1= new Employee(1001, "Employee:1", 200000, "Computer");
		Employee e2= new Employee(1002, "Employee:2", 350000, "IT");
		Employee e3= new Employee(1003, "Employee:3", 400000, "Computer");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		for(Employee e:set)
		{
			System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.dept);
		}
		
	}
}
