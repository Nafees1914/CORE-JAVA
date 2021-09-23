package BasicMaths;

import java.util.*;

public class naturalSum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nSum(n); 
	}
	
	public static void nSum(int n) 
	{	
		int sum =0;
		int count = 1;
		while(count <= n) 
		{
			sum += count;
			count++;
		}
		System.out.println(sum);
	}

}
