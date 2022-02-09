package JavaProg;

public class SumOfDigitOfString {

	public static void main(String[] args) {
		
		String s ="12Absc*&";
		int sum=0;
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48; //converting char to int by using ascii value i.e 0=48
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
