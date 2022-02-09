package JavaProg;

public class FibonnaciExcludingDefaultNum {

	public static void main(String[] args) {
		// print 5 num excluding defaauly num
		
		int a=0;
		int b=1;
		
		for(int i=0;i<5;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
