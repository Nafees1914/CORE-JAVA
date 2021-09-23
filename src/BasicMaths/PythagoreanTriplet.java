package BasicMaths;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean flag;
		
		int max = a;
		
		
		
		if(b>=max)
			max = b;
		
		if(c>=max)
			max = c;
		
		if(a==max) 
		{
			 flag = (b*b + c*c == a*a);
			 System.out.println(flag);
		}
		else if(b==max)
		{
			 flag = (a*a + a*a == b*b);
			 System.out.println(flag);
		}
		else 
		{
			 flag = (a*a + b*b == c*c);
			 System.out.println(flag);
		}
		
		
	}

}
