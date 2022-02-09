 package JavaProg;

import java.util.LinkedHashSet;

public class OccuranceOfCharInString {

	public static void main(String[] args) {

		String s ="HELLO";
		
		// step 1 = create set and add char of string to it
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		// step 2 = comparision of set with string
		
		for(Character c:set)  //set
		{
			int count =0;
			for(int i =0; i<s.length();i++)  // string
			{
				if(c==s.charAt(i)) //compare
				{
					count++;      //increase
				}
			}
			
			System.out.println(c+" "+count);
		}
	}

}
