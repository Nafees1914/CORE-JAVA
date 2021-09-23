package BasicMaths;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int item = sc.nextInt();
		
		int freq = 0;
		
		while(num != 0) 
		{
			int rem = num % 10;
			
			num = num / 10;
			
			if(rem == item)
				freq++;
		}
		
		
		System.out.println(freq);
	}

}
