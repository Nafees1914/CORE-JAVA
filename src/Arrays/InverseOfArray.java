package Arrays;

import java.util.*;

public class InverseOfArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) 
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Inverse : ");
		
		for(int val : arr) 
		{
			System.out.print(val + " ");
		}
		
		int Inverse [] = Inverse(arr);
		
		System.out.println();
		
		System.out.println("After Inverse : ");
		
		for(int val : Inverse) 
		{
			System.out.print(val + " ");
		}
	}
	
	public static int[] Inverse(int[] arr) 
	{
		int[] res = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) 
		{
			res[arr[i]] = i;
		}
		
		return res;
	}

}
