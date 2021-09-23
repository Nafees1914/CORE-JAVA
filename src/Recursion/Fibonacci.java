package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int nth = sc.nextInt();
		System.out.println(fib(nth));

	}
	public static int fib(int n) 
	{
		if(n==0 || n==1)
			return n;
		int  fib_nm1 = fib(n-1);
		int fib_nm2 = fib(n-2);
		int fib_n = fib_nm1 + fib_nm2;
		return fib_n;
	}

}
