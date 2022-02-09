package JavaProg;

public class SumOfEachDigit {
	

	public static void main(String[] args) {
		
		int n=135;
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;	
			n=n/10;
		}
		
		System.out.println(sum);
	}
}
