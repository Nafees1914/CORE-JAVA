package BasicMaths;

import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		
		long nod = 0;
		
		long temp = num;
		
		while(temp != 0) 
		{
			temp = temp /10;
			nod++;
		}
		
		long div = (long)Math.pow(10, nod-1);
		while(div != 0) 
		{
			long quo = num / div;
			
			System.out.println(quo);
			
			num = num % div;
			div = div / 10;
			
		}
		
		
	}

}
