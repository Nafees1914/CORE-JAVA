package Recursion;

import java.util.Scanner;

public class increa_decrea {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start =1;
		inc_dec(start,n);
	}
	public static void inc_dec(int start, int num) 
	{
		// Base Case
		if(start>num)
			return;
		
		//BP:
		System.out.println(start);
		
		//SP: self work
		inc_dec(start+1, num);
		System.out.println(start);
	}

}
