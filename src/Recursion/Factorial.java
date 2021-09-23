package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));

	}
	public static int fact(int num) 
	{
		if (num==0)
			return 1;
		int fact_BP = num;
		int fac_nm1 = fact(num-1);
		int factorial_n = fact_BP * fac_nm1;
		return factorial_n;
	}

}
