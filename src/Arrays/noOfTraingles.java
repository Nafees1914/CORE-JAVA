package Arrays;

import java.util.Arrays;

public class noOfTraingles {

	public static void main(String[] args) 
	{
		int[] arr = {6,4,9,7,8};
		
		int count = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length-1; i++) 
		{
			int j = i+1;
			int k = arr.length-1;
			
			while(j<k) 
			{
				if(arr[i] + arr[j] > arr[k]) 
				{
					count += k-j;
					k--;
					
				}
				else 
				{
					j++;
				}
				
			}
		}
		
		System.out.println("No. of Traingle formed is : " + count);
		
		
		
		
		// O(n3)
		
//		for(int i = 0; i<arr.length; i++) 
//		{
//			for(int j = i+1; j<arr.length; j++) 
//			{
//				
//				for(int k = j+1; k<arr.length; k++)
//				{
//						if(arr[i] + arr[j] > arr[k]) 
//						{
//							count++;
//						}
//				}
//			}
//		}
//		System.out.println("No. of Triangle formed is : " + count);

	}

}
