package JavaProg;

import java.util.LinkedHashSet;

public class PrintDuplicateWordInString {

	public static void main(String[] args) {

		String s= "welcome to india to";
		String[] spl = s.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for(int i=0;i<spl.length;i++)
		{
			set.add(spl[i]);
		}

		for(String word:set)
		{
			int count=0;
			for(int i=0;i<spl.length;i++)
			{
				if(word.equals(spl[i]))
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(word+" "+count);
			}
		}
	}

}
