package JavaProg;

public class ReverseStringWith3rdVariable {

	public static void main(String[] args) {

		String s="TYSS";
		String temp = s;
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}

		System.out.println(rev);
		System.out.println(s);
		
		
		if(s.equals(rev))
		{
			System.out.println("its palandrome");
		}
		else
		{
			System.out.println("not a palandrome");
		}
	}
}
