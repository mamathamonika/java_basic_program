package JavaProg;

public class NumberPalandrome {

	public static void main(String[] args) {

		int n=142;
		int temp=n;
		int rev=0;
		
		while(temp>0)
		{
			int ld = temp%10;
			rev = (rev*10) + ld;
			temp=temp/10;
		}
		
		if(n==rev)
		{
			System.out.println(n+": is a palandrome");
		}
		else
		{
			System.out.println(n+": is not a palandrome");
		}

	}

}
