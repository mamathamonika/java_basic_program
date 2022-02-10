package JavaProg;

import java.util.LinkedHashSet;

public class PositionOfEachCharInString {

	public static void main(String[] args) {
		//required output - postion of tesr

		String s ="Tester";
		s = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character c : set) 
		{
			for (int i = 0; i < s.length(); i++) 
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
