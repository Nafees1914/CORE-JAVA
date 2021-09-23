package Arrays;

import java.util.*;

public class SumOfArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] arr1 = {4, 1, 8, 6, 2};
		
		int[] arr2 = {4, 2, 3, 9, 0, 7, 5};
		
		System.out.println("This is Using Mathematical Method Sum : -->");
		arraySum_math(arr1 , arr2);
		
		System.out.println();
		
		System.out.println("This is Using Extra Space Sum : -->");
		arraySum_space(arr1, arr2);
	}
	
	
	// Using Extra Space
	public static void arraySum_space(int[] arr1, int[] arr2) 
	{
		int length1 = arr1.length;
		
		int length2 = arr2.length;
		
		int max_length = Math.max(length1, length2);
		
		int sum[] = new int[max_length];
		
		int i = length1 - 1;
		
		int j = length2 - 1;
		
		int k = sum.length-1;
		
		
		int rem;
		
		int carry = 0;
		
		
		while(k >=0) 
		{
			int digit = carry;
			
			if(i >= 0) 
			{
				digit += arr1[i];
			}
			
			if(j >= 0)
			{
				digit += arr2[j];
			}
			
			carry = digit / 10;
			
			digit = digit % 10;
			
			sum[k] = digit;
			
			j--;
			i--;
			k--;
	
		}
		
		if(carry>0)
			System.out.print(carry);
		
		for(int val : sum) 
		{
			System.out.print(val);
		}
	}
	
	
	//Without taking extra Array
	public static void arraySum_math(int[] arr1, int[] arr2) 
	{
		int i = arr1.length-1;
		int j = arr2.length-1;
		
		int carry = 0;
		
		int sum = 0;
		
		int mul = 1;
		
		int quo;
		
		int rem;
		
		int ans;
		
		while(i >=0 && j >= 0) 
		{
			quo = 0;
			
			rem = 0;
			
//			carry = 0;
			
			ans = arr1[i] + arr2[j] + carry;
			
			rem = ans % 10;
			
			quo = ans / 10;
			
			carry = quo;
			
			sum = sum + (rem*mul);
			
			mul = mul *10;
			
			i--;
			j--;
			
			
		}
		
		while(i >=0 || j >=0) 
		{
			if(j>=0) 
			{
				ans =  arr2[j] + carry;
			
				rem = ans % 10;
				
				quo = ans / 10;
			
				carry = quo;
			
				sum = sum + (rem*mul);
			
				mul = mul *10;
				
				j--;
			}
			else 
			{
				ans =  arr2[i] + carry;
				
				rem = ans % 10;
				
				quo = ans / 10;
			
				carry = quo;
			
				sum = sum + (rem*mul);
			
				mul = mul *10;
				
				i--;
			}
		}
		
		System.out.println(sum);
	}

}
