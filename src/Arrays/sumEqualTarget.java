package Arrays;

import java.util.*;

public class sumEqualTarget {

	public static void main(String[] args) 
	{
		int[] arr = {50, 45, 10 , 40, 95, 60, 80, 55};
		
		int target = 100;
		
		
		Arrays.sort(arr);
		
		int diff;
		int Min_diff = Integer.MAX_VALUE;	
		
		int num1 = 0;
		int num2 = 0;
		
		int i = 0;
		int j = arr.length-1;
		
		while(i < j) 
		{
			if(arr[i] + arr[j] == target) 
			{
				diff = arr[j] - arr[i]; 
				
				if(diff< Min_diff) 
				{
					Min_diff = diff;
					num1 = arr[i];
					num2 = arr[j];
				}
				
				System.out.println("Target is the sum of : " + arr[i]  +" " + arr[j]);
//				break;
				i++; 
				j--;
			}
			else if(arr[i] + arr[j] >target)
			{
				j--;
			}
			else 
			{
				i++;
			}
		}
		
		System.out.println( "Minimum Diff Pair -->" +num1 + " " + num2);
	}

}
