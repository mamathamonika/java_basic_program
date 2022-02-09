package JavaProg;

public class FibonnaciIncludingDefaultNum {

	public static void main(String[] args) {

		//print 5 fibonacci num including defalut
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<3;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
