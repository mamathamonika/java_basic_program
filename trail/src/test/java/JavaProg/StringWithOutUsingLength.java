package JavaProg;

public class StringWithOutUsingLength {
	
	public static void main(String[] args) {
		String s = "TEST";
		char[] c = s.toCharArray();
		int count=0;
		String rev="";
		for(char i:c)
		{
			count++;
		}
		
		
		for(int i=0;i<count;i++)
		{
			System.out.print(c[i]);
		}
		
		System.out.println(" ");
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		}
}
