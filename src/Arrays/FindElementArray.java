package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		System.out.println("Enter Array Element");
		for(int i =0; i<N; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter item you want to search : ");
		int item = sc.nextInt();
		
		System.out.println("Linear Search -> index of item : "+ LinearSearch(arr, item));
		
		System.out.println("Binary Search -> index of item : "+ BinarySearch(arr, item));

	}
	
	
	//Linear Search
	
	public static int LinearSearch(int[] arr, int item) 
	{
		for(int i = 0; i<arr.length; i++) 
		{
			if(arr[i] == item)
				return i;
		}
		return -1;
	}

	
	//Binary Search
	
	public static int BinarySearch(int[] arr, int item) 
	{
		Arrays.sort(arr);
		
		int low = 0;
		int high = arr.length-1;
		
		
		while(low <= high) 
		{
			int mid = (low+high)/2;
			
			if(item >arr[mid])
				low = mid+1;
			else if(item <arr[mid])
				high = mid-1;
			else
				return mid;
		}
		return -1;
	}
}
