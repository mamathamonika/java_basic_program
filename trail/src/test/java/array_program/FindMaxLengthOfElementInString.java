package array_program;

public class FindMaxLengthOfElementInString {

	public static void main(String[] args) {

		String [] st = {"hi","welcome","abcdefg","blue"};
		
		String web = st[0];
		for (int i = 0; i < st.length; i++) {
			if(web.length()<st[i].length())
			{
				web=st[i];
			}
		}

			for (int j = 0; j < st.length; j++) {
				if(web.length()==st[j].length())
				{
					System.out.println(st[j]);
				}
			}
		}


}
