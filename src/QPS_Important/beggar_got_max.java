package QPS_Important;

import java.util.*;

public class beggar_got_max {
	
	

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i = 1; i<=m; i++ ) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			
			arr[a] += k;
			arr[b+1] -= k;
		}
		
		int max = Integer.MIN_VALUE;
		
		int sum = 0;
		
		for(int i =0; i<arr.length-1; i++) 
		{
			sum += arr[i];
			
			if(sum > max)
				max = sum;
			
		}
		
		System.out.print(max);
	}

}
