package Arrays;

import java.util.*;
public class RotateArray {

	public static void main(String[] args) 
	{
//		Before rotation : -->
//		2 5 7 14 3 6 9 2 				for 4 rotation
//		After rotation : -->
//		3 6 9 2 2 5 7 14
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Array Element : ");
		for(int i = 0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter rotation : ");
		int rot = sc.nextInt();
		
		if(rot > arr.length)
			rot = rot % arr.length;
		
		if(rot<0)
			rot = rot+arr.length;
		
		rotate(arr, rot);
	}
	
	public static void reverse(int[] arr, int i, int j) 
	{
		int low = i;
		int high = j;
		
		while(low < high) 
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
		}
	}
		
	public static void rotate(int[] arr, int rot) 
	{
		//Part -1
		reverse(arr, arr.length -rot , arr.length-1);
		
		//Part -2
		reverse(arr, 0, arr.length -rot-1);
		
		//Part-3
		reverse(arr, 0, arr.length-1);
		
		for(int val : arr) 
		{
			System.out.print(val + " ");
		}
		
		
		
	} 
	

}
