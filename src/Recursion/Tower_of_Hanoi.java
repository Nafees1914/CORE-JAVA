package Recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {

	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int disk = sc.nextInt();
		TOH(disk,'A','B','C');

	}
	public static void TOH(int n, char from_rod, char to_rod, char aux_rod) 
	{
		if(n==0)
			return;
		
		TOH(n-1,from_rod, aux_rod, to_rod);
		System.out.println("Move disk from rod " + from_rod + "to rod" + aux_rod);
		
		TOH(n-1,aux_rod, to_rod, from_rod);
//		System.out.println("Move disk from rod" + to_rod + "to_rod" + to_rod);
	}

}
