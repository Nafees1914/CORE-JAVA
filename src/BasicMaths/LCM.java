package BasicMaths;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int rem = 0;
		
		int prod = n1 * n2;
		
		while(n1 !=0) 
		{
			rem = n2 %n1;
			n2 = n1;
			n1 = rem;
		}
		int GCD = n2;
		
		int LCM = prod/GCD;
		
		System.out.println(LCM);
	}

}
