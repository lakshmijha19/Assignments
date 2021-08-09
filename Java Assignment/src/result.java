import java.util.Scanner;
public class result { 
	static int marks1;
	static int marks2;
	static int marks3;
		public static void main(String args[])
		{
		   	Scanner sc= new Scanner(System.in);
			System.out.println("Insert 3 Subject Marks: ");
			marks1=sc.nextInt();
			marks2=sc.nextInt();
			marks3=sc.nextInt();
			if(marks1>60 && marks2>60 && marks3>60)
			{
				System.out.println("Pass");
			}
			else if((marks1>60 && marks2>60)|| (marks2>60 && marks3>60)||(marks3>60 && marks1>60))
			{
				System.out.println("Promoted");
			}
			else if((marks1>60 || marks2>60 || marks3>60)||(marks1<60 && marks2<60 && marks3<60))
			{
				System.out.println("Fail");
			}
			sc.close();
		}
}
