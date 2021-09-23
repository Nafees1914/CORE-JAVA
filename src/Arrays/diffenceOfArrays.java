package Arrays;

public class diffenceOfArrays {

	public static void main(String[] args) 
	{
		// Assumption  arr2 have greater length
		
		int[] arr1 = {1};
		int[] arr2 = {100};
		
		int[] diff = new int [arr2.length];
		
		int i = arr1.length -1;
		int j = arr2.length -1;
		int k = diff.length -1;
		
		int carry = 0;
		
		int digit;
		System.out.println(5);
		while(k >=0) 
		{
			digit = 0;
			
			int arr1V = i >=0 ? arr1[i] : 0;  // if array 1 is no more to participate 
			if(arr2[j] + carry >= arr1V) 
			{
				digit = arr2[j] + carry - arr1V;
				carry = 0;
			}
			else 
			{
				digit = arr2[j] + carry + 10 - arr1V;
				carry = -1;
			}
			
			diff[k] = digit;
			
			i--;
			j--;
			k--;
		}
		
		int index = 0;
		
		while(index < diff.length) 
		{
			if(diff[index] == 0) 
			{
				index++;
			}
			else 
			{
				break;
			}
		}
		
		while(index < diff.length) 
		{
			System.out.print(diff[index]);
		}

	}

}
