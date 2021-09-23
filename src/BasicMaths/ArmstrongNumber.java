package BasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int nod = nod(num);
		
		System.out.println(isArmstrong(nod, num));
		
	}
	
	public static int nod(int num) 
	{
		int count = 0;
		while(num != 0) 
		{
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static boolean isArmstrong(int nod, int num) 
	{
		int temp = num;
		
		int ans = 0;
		while(temp != 0) 
		{
			int digit = temp % 10;
			
			temp = temp/10;
			
			ans += (int)Math.pow(digit, nod);
		}
		
		if(ans == num)
			return true;
		else
			return false;
	}

}
