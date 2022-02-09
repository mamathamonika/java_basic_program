package JavaProg;

import java.util.HashSet;

public class VowelsWithoutDuplicates {

	public static void main(String[] args) {

		String s= "india";
		
		HashSet<Character> set =new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ovel:set)
		{
			if(ovel=='a' ||ovel=='e' ||ovel=='i' ||ovel=='o' ||ovel=='u')
			{
				System.out.println(ovel);
			}
		}

	}

}
