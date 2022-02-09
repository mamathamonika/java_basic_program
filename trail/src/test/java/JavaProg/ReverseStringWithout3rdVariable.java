package JavaProg;

public class ReverseStringWithout3rdVariable {

	public static void main(String[] args) {

		String s= "TYSS";
		for (int i = s.length()-1; i >= 0; i--) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
