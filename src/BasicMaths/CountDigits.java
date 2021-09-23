package BasicMaths;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		
		long digit = 0;
		
		if(num == 0) 
		{
			System.out.println(1);
		}
		else {	
		
		while(num != 0) 
		{
			num = num/10;
			digit++;
		}
		System.out.println(digit);
		}
	}

}
