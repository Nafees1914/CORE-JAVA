package ArrayList;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) 
	{
		int one[] = {5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 60, 80 };
		
		int two[] = {10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90};
		
		ArrayList<Integer> list = intersection(one, two);
		
		for(int val : list) 
		{
			System.out.print(val + " ");
		}

	}
	
	public static ArrayList<Integer> intersection(int one[], int two[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i< one.length && j < two.length) 
		{
			if(one[i] < two[j]) 
			{
				i++;
			}
			else if(one[i] > two[j]) 
			{
				j++;
			}
			else 
			{
				list.add(one[i]);
				i++;
				j++;
			}
		}
				
		return list;
	}

}
