package JavaProg;

import java.util.LinkedHashSet;

public class PositionOfEachCharInStringFromReverse {

	public static void main(String[] args) {

		//last postion of char
		
		String s ="Tester";
		s = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character c : set) 
		{
			for (int i = s.length()-1; i>=0; i--) 
			{
				if(c == s.charAt(i))
				{
					System.out.println(c+" "+(i+1));
					break;  //to remove reading of t again
				}
			}

		}

	}

}
