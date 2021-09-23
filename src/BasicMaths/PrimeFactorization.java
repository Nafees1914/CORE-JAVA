package BasicMaths;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 2;
		
		while(num != 1) 
		{
			if(num % count == 0) 
			{
				num = num/count;
				System.out.println(count);
			}
			else 
			{
				count++;
				if(num%count == 0) 
				{
					num = num / count;
					System.out.println(count);
				}
			}
		}

	}

}
