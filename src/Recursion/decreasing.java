	
// Take input as n & then print it in decreasing order from n to 1



package Recursion;

import java.util.Scanner;

public class decreasing {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("----------------");
		dec(n);
		System.out.println("----------------");
		

	}
	
	public static void dec(int n) 
	{
		if(n<=0)
			return;
		
		System.out.println(n);
		dec(n-1);
	}

}
