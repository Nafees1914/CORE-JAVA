package Arrays;

public class Kadanes_Algorithm {

	public static void main(String[] args) 
	{
		// for updated Kadanes Algorithm :
		
		
//		int[] arr = {2,3,-6,1,2,3,-4,5,-10,6};
//		int curr_sum = 0;
//		int max_sum = 0;   
//		
//		for(int i = 0; i<arr.length; i++) 
//		{
//			curr_sum = curr_sum + arr[i];
//			
//			
//			if(curr_sum < arr[i])
//			{
//				curr_sum = arr[i];
//			}
//			
//			
//			if(curr_sum > max_sum) 
//			{
//				max_sum = curr_sum;
//			}
//		}
//		System.out.println(max_sum);	
//		
		
		// Maam Method
		
		int[] arr = {2,3,-6,1,2,3,-4,5,-10,6};
		int sum = arr[0];
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) 
		{
			sum = Math.max(arr[i], sum + arr[i]);
			if(sum > max) 
			{
				max = sum;
			}
		}
		System.out.println(max);
//		
//		
		
		/// kadanes 2
		
//		int[] arr = {2,3,-6,1,2,3,-4,5,-10,6};
//		int[] start = new int[arr.length];
//		start[0] = 0;
//
//		int ei = 0;
//
//		int sum = arr[0];
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//
//			int alreadyExistingAdd = sum + arr[i];
//			int freshStart = arr[i];
//
//			if (alreadyExistingAdd > freshStart)
//				start[i] = start[i - 1];
//			else
//				start[i] = i;
//
//			sum = Math.max(alreadyExistingAdd, freshStart);
//
//			if (sum > max) {
//				max = sum;
//				ei = i;
//			}
//		}
//
//		System.out.println(start[ei] + " " + ei);
//
	}

}
