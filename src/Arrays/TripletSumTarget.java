package Arrays;

import java.util.*;

public class TripletSumTarget {

	public static void main(String[] args) 
	{
		int[] arr = {5,7,9,1,2,4,6,8,3};
		
		int target = 10;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) 
		{
			int j = i+1;
			
			int k = arr.length-1;
			
			while(j < k) 
			{
				if(arr[i] + arr[j] + arr[k] == target) 
				{
					System.out.println("Triplets are : "+ arr[i] + " " + arr[j] + " " + arr[k]);
					k--;
					j++;
				}
				else if(arr[i] + arr[j] + arr[k] > target)
				{
					k--;
				}
				else 
				{
					j++;
				}
			}
		}

	}

}
