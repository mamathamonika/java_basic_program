package JavaProg;

public class PrintPrimeNumFromGivenArray {

	public static void main(String[] args) {

		int [] a = {2,3,4,5,6,7,8};
		
		for (int i = 0; i < a.length; i++) 
		{
			int n = a[i];
			int a1=2;
			
			while(a1<=n)
			{
				if(n%a1==0)
				{
					break;
				}
				else
				{
					a1++;
				}
			}
			if(n==a1)
			{
				System.out.println(n+" : is prime");
			}
			
			/*else
			{
				System.out.println("no prime num");
			}*/
		}

	}

}
