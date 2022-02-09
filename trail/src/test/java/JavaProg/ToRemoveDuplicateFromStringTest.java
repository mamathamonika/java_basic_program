package JavaProg;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ToRemoveDuplicateFromStringTest {

	public static void main(String[] args) {

		String s = "HELLO";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character c:set)
		{
			System.out.print(c);
		}

	}

}
