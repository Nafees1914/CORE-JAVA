package Arrays;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Before  Reverse : ");
		for(int val : arr) 
		{
			System.out.print(val + " ");
		}

		System.out.println();
		
		Reverse(arr);
	}
	
	public static void Reverse(int[] arr) 
	{
		int i = 0;
		int j = arr.length-1;
		
		while(i <= j) 
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.print("After Reverse : ");
		for(int val : arr) 
		{
			System.out.print(val + " ");
		}
	}

}
