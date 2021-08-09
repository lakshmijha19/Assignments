import java.util.Scanner;
public class score {
	public static void main(String args[])
	{
		int total=0; 
		int avg=0;
		Scanner sc=new Scanner(System.in);
		int[][] marks = new int[3][3];
		System.out.println(marks.length);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter student "+i+" marks for 3 subjects: ");
			for(int j=0;j<marks[i].length;j++)
			{
				marks[i][j]=sc.nextInt();
				total=total+marks[i][j];
			}
		}
		System.out.println("Display Marks: ");
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j] + "\t");
			}
			System.out.println("");
		}
		avg=total/9;
		System.out.println("Total Score of all subjects: "+total);
		System.out.println("Average of all subjects: "+avg);
		System.out.println("");
		
		for(int i=0;i<marks.length;i++)
		{
			total=0;avg=0;
			for(int j=0;j<marks[i].length;j++)
			{
				total=total+marks[j][i];
			}
			avg=total/3;
			System.out.println("Total Score of "+i+" subject "+total);
			System.out.println("Average of "+i+" subject "+avg);
			System.out.println("");
		}
		
		sc.close();	
	}

}
