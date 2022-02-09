package JavaProg;

public class StringAndReverseString {

	public static void main(String[] args) {


		String s = "TEST";
		for (int i = 0; i < s.length(); i++) {
			char data = s.charAt(i);
			System.out.print(data);
		}
		
		System.out.println(" ");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
