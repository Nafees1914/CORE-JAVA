package String;

public class EvenLengthPalindrome {

	public static void main(String[] args) 
	{
		String str = "aabccb";
		
		int count = 0;
		
		for(double axis = 0.5; axis < str.length(); axis++) 
		{
			for(double orbit = 0.5; axis - orbit >=0 && axis + orbit < str.length(); orbit++) 
			{
				if(str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit)))
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
