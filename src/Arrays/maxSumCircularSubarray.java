package Arrays;

public class maxSumCircularSubarray {

	public static void main(String[] args) 
	{
		
//		int[] arr = {8, -8, 9 , -9, 10, -11, 12};
		
		int[] arr = {10, -12, -5, 3, 11};
		
		// CE : contributing Element
		// NCE : Non Contributing Element
		
		int max = circularArrayMaxSubarraySum(arr);
		System.out.println("Max sum of Circular subarray : "+ max);
	}
	
	public static int kadane(int[] arr) 
	{
		int sum = arr[0];
		int max_sum = arr[0];
		
		for(int i = 1; i < arr.length; i++) 
		{
			sum = Math.max(arr[i], sum + arr[i]);
			if(sum > max_sum)
				max_sum = sum;
		}
		return max_sum;
		
	}
	
	public static int circularArrayMaxSubarraySum(int[] arr) 
	{

		// Case 1 : CE are non wrapping
		int ceNotWrapping = kadane(arr);

		// Case 2 : CE are wrapping
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		int NCE_Sum = kadane(arr);

		int ceWrapping = totalSum + NCE_Sum;

		// returning the max b/w two cases :
		return Math.max(ceNotWrapping, ceWrapping);

	}

}
