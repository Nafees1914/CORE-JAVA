package Recursion;

import java.util.Scanner;

public class LastOccurence {

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
		
		System.out.println(" Enter the item you want to know :  ");
		int item  =  sc.nextInt();
		int vidx = 0;
		
		int last_index = Last_Occurence_Index(arr ,vidx , item);
		System.out.println("Index of array element at last occurence : " + last_index);

	}
	 
				/// METHOD --- 1
	public static int Last_Occurence_Index(int[] arr, int vidx, int item) 
	{
		// Base case:
		if(vidx == arr.length)
			return -1;
		
		int SpIndex = Last_Occurence_Index(arr, vidx+1, item);
		if(SpIndex == -1) 
		{
			if(arr[vidx] == item)
				return vidx;
			else
				return -1;
		}
		else 
		{
			return SpIndex;
		}	
		
	}
	
	
				/// METHOD --- 2
//	public static int Last_Occurence_Index(int[] arr, int vidx, int item) 
//	{
//		// Base case:
//		if(vidx == arr.length)
//			return -1;
//		
//		int SpIndex = Last_Occurence_Index(arr, vidx+1, item);
//		if(arr[vidx] == item && SpIndex == -1) 
//		{
//			return vidx;
//		}
//		
//		return SpIndex;
//
//	}
	

}
