package BasicMaths;

import java.util.*;
public class GCD {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		

		
		while(n1 !=0) 
		{
			int n3 = n2%n1;
			n2 = n1;
			n1= n3;
		}
		System.out.println(n2 + " is the HCF");
	}

}
