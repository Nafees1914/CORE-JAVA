package String;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "aaabbcbbaaa";
		
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) 
		{
			if(str.charAt(i) == str.charAt(j)) 
			{
				i++;
				j--;
			}
			else 
			{
				break;
			}
		}
		if(i==j)
			System.out.println("Yes Palindrome");
		else
			System.out.println("No Palindrome");
	}
}
