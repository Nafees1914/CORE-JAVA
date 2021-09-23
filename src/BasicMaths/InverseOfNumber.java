package BasicMaths;

import java.util.*;

public class InverseOfNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int inverse = 0;
		
		int pos = 1;
		
		while(num != 0) 
		{
			int rem = num %10;
			
			inverse += pos * (int)Math.pow(10, rem-1);
			
			num = num/10;
			
			pos++;
		}
		
		System.out.println(inverse);
	}

}
