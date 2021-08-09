
public class bubblesort {
	public static void main(String args[])
	{
		int[] bs= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				if(bs[i]<bs[j])
				{
					int temp=bs[i];
					bs[i]=bs[j];
					bs[j]=temp;
				}
			}
		}
		System.out.println("Sorted: ");
		for(int i=0;i<15;i++)
		{
			System.out.println(bs[i]);
		}
	}

}
