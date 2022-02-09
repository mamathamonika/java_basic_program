package JavaProg;

import java.util.LinkedHashSet;

public class PrintUniqueCharInString {

	public static void main(String[] args) {

		String s = "HELLO";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character c:set)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.print(c);
			}
		}


	}

}
