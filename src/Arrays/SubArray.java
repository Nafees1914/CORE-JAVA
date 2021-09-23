package Arrays;

public class SubArray {

	public static void main(String[] args)
	{
		int[] arr = {10 ,20, 30,40};
		
		PrintSubArray(arr);

	}
	
	public static void PrintSubArray(int[] arr) 
	{
		int sum = 0;
		for(int si =0; si < arr.length; si++) 
		{
			for(int ei = si; ei < arr.length; ei++) 
			{
				for(int sub = si; sub<=ei; sub++) 
				{
					System.out.print(arr[sub]+" ");
					sum = sum + arr[sub];
				}
				System.out.println();
			}	
		}
		
		System.out.println();
		System.out.println("Total Sub-Array sum : " + sum);
	}

}
