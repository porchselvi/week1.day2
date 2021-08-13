package assigment;

public class CharOccurance {
	public static void main(String args[])
	{
		String a = "Hi, guys.Am ps";
		int count = 0;
		
		char[] ch = a.toCharArray();
				
		for(int i = 0; i < a.length(); i++)
		{
			for (int j = i + 1; j < a.length(); j++) {
				if(ch[i] == ch[j])
				{
					System.out.println("The character of " +ch[j]+ " appears "+count+ " times");
					count++;
					break;
				}
				
			}
		}
	}

}
