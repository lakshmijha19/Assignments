public class MiniMaxFinder {

	public int[] findMiniMax(int[] array) {
		
	
		      int max = array[0];
		      int min= array[0];
		  
		      for(int i=0; i<array.length; i++ ) {  
		         if(array[i]>max) {  
		            max = array[i];
		           
		         }
		         if(min>array[i]) {
		        	 min = array[i];
		         }
		      }
		      int arr[] = {max, min};
		      return arr;
		      
		   }  
}