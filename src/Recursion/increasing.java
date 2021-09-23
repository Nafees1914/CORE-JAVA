package Recursion;

import java.util.Scanner;

public class increasing {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		inc(n);
	}
	public static void inc(int n) 
	{
		//Base condition
		if(n==0)
			return;
		
		//SP:
		inc(n-1);
		
		//BP: self work
		System.out.println(n);
	}

}
