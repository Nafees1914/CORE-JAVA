package Recursion;

import java.util.Scanner;

public class DisplayArray {

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
		
		System.out.println("Array Elements Are :  ");
		int vidx = 0;
		Display(vidx , arr);
	}
	
	public static void Display(int vidx , int[] arr) 
	{
		if(vidx == arr.length) 
		{
			return;
		}
		// work
		System.out.print(arr[vidx] + " ");
		//Smaller Problem
		Display(vidx+1 , arr);
	}
}
