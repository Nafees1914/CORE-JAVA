package String;

public class SubString {

	public static void main(String[] args) 
	{
		String str = "nitin";
		
		for(int si = 0; si<str.length(); si++) 
		{
			for(int ei = si+1; ei<=str.length(); ei++) 
			{
				System.out.println(str.substring(si,ei));
			}
		}

	}

}
