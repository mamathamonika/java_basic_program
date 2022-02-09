package JavaProg;

import java.util.LinkedHashSet;

public class OccuranceOfWordInString {

	public static void main(String[] args) {
		
		String s ="welcome to India to";
		String[] spl = s.split(" ");

		//create set 
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<spl.length;i++)
		{
			set.add(spl[i]);
		}
		
		//comparision
		for(String word:set)
		{
			int count=0;
			for (int i = 0; i < spl.length; i++) 
			{
				if(word.equals(spl[i]))
				{
					count++;
				}
			}
			
			System.out.println(word+" "+count);
		}
	}
	

}
