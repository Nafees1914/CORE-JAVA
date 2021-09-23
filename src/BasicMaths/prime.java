package BasicMaths;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		primeOrNot(n);

	}
	
	public static void primeOrNot(int n) 
	{
		int count = 2;
		int fact = 0;
		while(count * count <=n) 
		{
			if(n%count == 0)
			{
				fact+=1;
			}
			count++;
		}
		
		if(fact == 0)
			System.out.println("Pime number");
		else
			System.out.println("Not a prime number");
	}

}
