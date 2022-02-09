package JavaProg;

public class ReverseWorldForGivenString {

	public static void main(String[] args) {

		String s ="welcome to India";
		String[] splited = s.split(" ");

		for(int i=splited.length-1; i>=0 ; i--)
		{
			System.out.println(splited[i]);
		}
	}

}
