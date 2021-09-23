package Recursion;

import java.util.Scanner;

public class MaximumInArray {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		int vidx = 0;
//		int max = Integer.MIN_VALUE;
		int max = maximum(vidx , arr );
		System.out.println("Maximum of array is : " + max);
	}
	
			// METHOD --- 1
	public static int maximum(int vidx , int[] arr) 
	{
		if(vidx == arr.length -1) 
		{
			return arr[vidx];
		}
		
		// misa : max in smaller array
		
		int misa = maximum(vidx+1 , arr);
		if(misa> arr[vidx]) 
		{
			return misa;
		}
		else 
		{
			return arr[vidx];
		}
	}
	
	
			// METHOD --- 2
//	public static int maximum(int vidx , int[] arr) 
//	{
//		if(vidx == arr.length) 
//		{
//			return Integer.MIN_VALUE;
//		}
//		
//		// sp : max in smaller problem
//		// bp	: max in bigger problem
//		
//		int sp = maximum(vidx+1 , arr);
//		int bp = Math.max(arr[vidx], sp);
//		
//		return bp;
//	}

	// Method-3
//	public static int maximum(int vidx, int[] arr,  int max) 
//	{
//		if(vidx == arr.length) 
//		{
//			return max;
//		}
//		
//		if(arr[vidx] > max) 
//		{
//			max = arr[vidx];
//		}
//		int max2 = maximum(vidx+1, arr, max);
//		return max2;
//	}
}
