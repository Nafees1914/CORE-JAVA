package Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) 
	{
//		int[] arr = {10,20,30,40};
		
		int[] arr = {-5,4,6,-3,4,-1};
		
//		int[] arr = {2,3,-6,1,2,3,-4,5,-10,6};
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int si = 0; si<arr.length; si++) 
		{
			sum = 0;
			for(int ei = si; ei<arr.length; ei++) 
			{
				sum = sum + arr[ei];
				if(sum>max) {
					max=sum;
				}
			}
		}
		System.out.println(max);

	}

}
