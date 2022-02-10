package array_program;

public class FindMinLengthOfElementInStringArray {

	public static void main(String[] args) {

		String [] st = {"hi","a","hello","b"};
		String min = st[0];
		for (int i = 0; i < st.length; i++) {
			if(min.length()>st[i].length())
			{
				min=st[i];
			}
			
		}
		for (int i = 0; i < st.length; i++) {
			if(min.length()==st[i].length())
			{
				System.out.println(st[i]);
			}
		}

	}

}
