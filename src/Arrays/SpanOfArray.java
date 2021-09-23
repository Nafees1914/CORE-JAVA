package Arrays;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//size : 6
		//element : 15 30 40 4 11 9
		// difference b/w max an min of array
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		span(arr);

	}
	
	public static void span(int arr[]) 
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i< arr.length; i++) 
		{
			if(arr[i] > max)
				max = arr[i];
			
			if(arr[i] < min)
				min = arr[i];
		}
		
		int spanDiff = max - min;
		
		System.out.println(spanDiff);
	}

}
