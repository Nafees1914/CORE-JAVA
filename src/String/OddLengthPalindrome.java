package String;

public class OddLengthPalindrome {
	
	public static void main(String[] args) 
	{
		String str = "abcbdbce";
		
		int count = 0;
		
		for(int axis = 0; axis < str.length(); axis++) 
		{
			for(int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) 
			{
				if(str.charAt(axis - orbit) == str.charAt(axis + orbit))
				{
					count++;
				}
				else 
				{
					break;
				}
			}
		}
		System.out.println(count);

	}

}
