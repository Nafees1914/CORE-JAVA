package BasicMaths;

import java.util.Scanner;

public class primeSeries {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i = low; i<=high; i++)
		{
			int fact = 0;
			int count = 2;
			while(count * count <= i) 
			{
				if(i % count==0) 
				{
					fact++;
					break;
				}
				count++;
			}
			if(fact==0)
				System.out.println(i);
	
		}

	}

}
