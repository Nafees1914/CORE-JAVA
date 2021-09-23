package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rem = 0;
		int ans = 0;
		
		while(n !=0)
		{
			rem = n % 10;
			n = n / 10;
			ans = ans * 10 + rem;
		}
		System.out.println(ans);
	}

}
