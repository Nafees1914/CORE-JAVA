package Recursion;

public class AllIndex {

	public static void main(String[] args) 
	{
		// 2 3 6 9 8 3 2 3 6 4
		int [] arr = {2,3,6,9,8,3,2,3,6,4};
		int[] res_arr = allIndex(arr, 0 , 3 , 0);
		for(int val : res_arr) 
		{
			System.out.println(val);
		}

	}

	public static int[] allIndex(int[] arr, int vidx , int item , int count) 
	{
		
		if(vidx == arr.length) 
		{
			return new int[count];
		}
		
		if(arr[vidx] == item) 
		{
			int[] count_arr = allIndex(arr, vidx+1, item, count+1);
			count_arr[count] = vidx;
			return count_arr;
		}
		
		int[] count_arr = allIndex(arr, vidx+1, item, count);
		
		return count_arr;
	}
}
