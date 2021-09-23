package BasicMaths;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rot = sc.nextInt();
		
		int temp = num;
		
		int nod = 0;
		
		while(temp != 0) 
		{
			temp = temp / 10;
			nod++;
		}
		
		rot = rot % nod;
		
		int div = (int)Math.pow(10, rot);
		
		int quo = num / div;
		
		int rem = num % div;
		
		int mul = (int)Math.pow(10, nod-rot);
		
		int ans = rem * mul + quo;

		System.out.println(ans);
	}

}
