package JavaProg;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n=8;
		int i=2;
		/*String result ="prime";
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				result="not prime";
				break;
			}
		}
		System.out.println(result);*/
		
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		if(n==i)
		{
			System.out.println("its prime");
		}
		else
			System.out.println("not a prime");
	}

}
