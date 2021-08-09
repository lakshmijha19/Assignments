import java.util.*;

public class Swap {

	public static final <T> void swap(T[] a, int i, int j)
	{
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String args[])
	{
		String[] s= {"Hello", "Lakshmi"};
		Swap.swap(s, 0, 1);
		System.out.println("s:"+ Arrays.toString(s));
	}
}
