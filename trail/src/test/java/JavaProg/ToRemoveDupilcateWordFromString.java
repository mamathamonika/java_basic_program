package JavaProg;

import java.util.LinkedHashSet;

public class ToRemoveDupilcateWordFromString{

	public static void main(String[] args) {

		String s ="welcome to india to india";
		String[] spl = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<spl.length;i++)
		{
			set.add(spl[i]);
		}

		for(String word:set)
		{
			System.out.print(word+" ");
		}
	}

}
