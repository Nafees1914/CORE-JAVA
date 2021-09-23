package BasicMaths;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		

		
		fibSeries(n);

	}
	
	public static void fibSeries(int n) 
	{
		int a = 0;
		int b = 1;
		int count = 0;
		
		
		while(count <= n)
		{
			System.out.println(a);
			
			int sum = a+b;
			
			a = b;
			
			b = sum;
			
			count++;
		}
		
		
	}

}
