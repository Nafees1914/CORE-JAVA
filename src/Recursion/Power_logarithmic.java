package Recursion;

import java.util.Scanner;

public class Power_logarithmic {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exp = sc.nextInt();
		System.out.println(power(base,exp));

	}
	
	// O(logn)
	public static int power(int x,int n) 
	{
		if(n==0)
			return 1;
		
		int xpnb2 = power(x,n/2);
		int xpn = xpnb2 * xpnb2;
		
		if(n%2==1) 
		{
			xpn = xpn * x;
		}
		
		return xpn; 
	}

}
