package Recursion;

import java.util.Scanner;

public class FirstOccurence {

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
		
		int first_index = First_Occurence_Index(vidx , arr , item);
		System.out.println("Index of array element at first occurence : " + first_index);

	}
	 
	public static int First_Occurence_Index(int vidx, int[] arr, int item) 
	{
		// Base case:
		if(vidx == arr.length)
			return -1;
		
		if(arr[vidx] ==  item) 
		{
			return vidx;
		}
		
		// else part :
		int SpIndex = First_Occurence_Index(vidx+1, arr, item);
		
		return SpIndex;
	}

}
