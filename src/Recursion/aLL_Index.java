package Recursion;

import java.util.Scanner;

public class aLL_Index {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) 
		{
			arr[i] = sc.nextInt(); // 2 3 6 9 8 3 2 3 6 4
		}
		
		System.out.println("Enter no. you their all index : ");
		int item = sc.nextInt();
		
		int vidx = 0;
		int count = 0;
		int[] res_arr = All_Index(arr , vidx , count , item);
		for(int val : res_arr) 
		{
			System.out.println(val);
		}

	}
	
	public static int[] All_Index(int[] arr, int vidx, int count ,int item) 
	{
		if(vidx == arr.length) 
		{
			int[] res = new int[count];
			return res;
		}
		
		if(arr[vidx] == item) 
		{
			int[] res = All_Index(arr, vidx+1, count+1, item);
			res[count] = vidx;
			return res;
		}
		else 
		{
			int[] res= All_Index(arr, vidx+1, count, item);
			return res;
		}
	}

}
