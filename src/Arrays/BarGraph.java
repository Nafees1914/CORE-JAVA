package Arrays;

import java.util.*;

public class BarGraph {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter element of array : ");
		
		for(int i =0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
			
		}
		
		int max = maximum(arr);
		Graph(arr, max);
	}
	
	public static int maximum(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		int index_max = Integer.MIN_VALUE;
		
		for(int i =0; i<arr.length; i++) 
		{
			if(arr[i] > max) 
			{
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void Graph(int[] arr, int max) 
	{
		
		for(int row =max; row>=1; row--) 
		{
			for(int col = 0; col < arr.length; col++) 
			{
				if(arr[col] >= row) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
