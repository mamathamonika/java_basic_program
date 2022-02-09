package JavaProg;

public class AlphNumSpecailChar {

	public static void main(String[] args) {

		String s = "a1b2A@d$";
		String alph="" , num="" , special="";
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='A' ||s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				alph=alph+s.charAt(i);
			}
			
			else if(s.charAt(i)>= '0' && s.charAt(i)<= '9')
			{
				num=num+s.charAt(i);
			}
			
			else
			{
				special=special+s.charAt(i);
			}
		}
		
		System.out.println(alph);
		System.out.println(num);
		System.out.println(special);

	}

}
