package Arrays;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args)
	{
		int  n = 25;
		
		boolean[] primes = new boolean[n+1];
		
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for(int table = 2; table*table<n; table++) 
		{
			if(primes[table] == false)
				continue;
			for(int mul = 2; table*mul <n; mul++) 
			{
				primes[table*mul] = false;
				
			}
				
		}
		
		for(int i = 0; i<primes.length; i++) 
		{
			if(primes[i])
				System.out.print(i + " ");
				
		}
		
	}

}
