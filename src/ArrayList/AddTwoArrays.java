package ArrayList;

import java.util.ArrayList;

public class AddTwoArrays {

	public static void main(String[] args) 
	{
		int one[] = {9, 8, 7, 5};
		
		int two[] = {9, 6, 7};
		
		ArrayList<Integer> ans = sum(one, two);
		
		for(int val : ans) 
		{
			System.out.print(val + " ");
		}

	}
	
	public static ArrayList<Integer> sum(int[] one, int[] two)
	{
		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		int i = one.length-1;
		int j = two.length-1;
		
		int carry = 0;
		
		while(i >=0 || j>=0) 
		{
			int add = carry;
			
			if(i>=0)
				add += one[i];
			
			if(j>=0)
				add += two[j];
			
			int rem = add % 10;
			
			carry = add / 10;
			
			sum.add(0,rem);
			
			i--;
			j--;
			
		}
		if(carry>0)
			sum.add(0,carry);
		
		return sum;
	}

}
