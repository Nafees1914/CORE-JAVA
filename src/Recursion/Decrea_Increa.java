package Recursion;

import java.util.Scanner;

public class Decrea_Increa {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dec_inc(n);

	}
	public static void dec_inc(int num) 
	{
		if(num==0)
			return;
		System.out.println(num);
		dec_inc(num-1);
		System.out.println(num);
	}

}
