package BasicMaths;

import java.util.*;

public class OddEven {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int num =  sc.nextInt();
		
		checkEvenOdd(num);

	}
	
	public static void checkEvenOdd(int num) 
	{
		if(num%2==0)
			System.out.println( num +" is Even");
		else
			System.out.println(num + " is Odd");
	}

}
