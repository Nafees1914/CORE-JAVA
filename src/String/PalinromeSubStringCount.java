package String;

public class PalinromeSubStringCount {

	public static void main(String[] args) 
	{
		String str = "nitin";
		
		int count = 0;
		
		System.out.println(SubString(str, count));
	}
	
	public static int SubString( String str, int count) 
	{
		for(int si = 0; si<str.length(); si++) 
		{
			for(int ei = si+1; ei<=str.length(); ei++) 
			{
				if(palindrome(str.substring(si,ei))) 
				{
					
					// To print all Palindrome substring 
					System.out.println(str.substring(si,ei));
					count++;
				}		
			}
		}
		return count;
	}

	private static boolean palindrome(String substring) 
	{
		int i = 0;
		int j = substring.length()-1;
		
		while(i < j) 
		{
			if(substring.charAt(i) != substring.charAt(j))
				return false;
			
			i++;
			j--;
		}
		
		return true;
	}

}
