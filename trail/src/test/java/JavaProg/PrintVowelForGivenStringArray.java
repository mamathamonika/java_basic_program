package JavaProg;

import java.util.LinkedHashSet;

public class PrintVowelForGivenStringArray {

	public static void main(String[] args) {

		String[] s = {"apple","banana"};
		
		for (int i = 0; i < s.length; i++) {
			String a = s[i];
			int count=0;
			for (int j = 0; j < a.length(); j++) {

				if(a.charAt(j)=='a'||a.charAt(j)=='e'|| a.charAt(j)=='i'|| a.charAt(j)=='o'|| a.charAt(j)=='u')
				{
					count++;
				}

			}
			System.out.println(a+" "+count);
		}

	}

}
