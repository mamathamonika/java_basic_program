package JavaProg;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {

		String s = "welcome to tyss";
		char first = (char) (s.charAt(0)-32);
		System.out.print(first);
		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				System.out.print(" "+(char) (s.charAt(i+1)-32));
				i=i+1;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}

	}

}
