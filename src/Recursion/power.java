package Recursion;

import java.util.Scanner;

public class power {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base as number");
		int base = sc.nextInt();
		System.out.println("Enter exponent as number");
		int exp = sc.nextInt();
		
		System.out.println(pow(base,exp));

	}
	// O(n)
	public static int pow(int base, int exp) 
	{
		if(exp==0)
			return 1;
		int sp = pow(base,exp-1);
		int bp = base* sp;
		return bp;
	}

}
