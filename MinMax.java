import java.util.Arrays;

public class MinMax {
	
		public int getMin(int[] arr) {
			Arrays.sort(arr);
			int min=arr[0];
			return min;
		}
		
		public int getMax(int[] arr) {
			Arrays.sort(arr);
			int max=arr[arr.length-1];
			return max;
		}

}