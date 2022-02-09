package JavaProg;

public class FibonnaciLassThan25 {
	
	public static void main(String[] args) {
		
		// fibonacci up less than 25
		
		int a=0;
		int b=1;
		
		for(int i=0; i<25;i++)
		{
			int c=a+b;
			
			if(c<25)
			{
				System.out.println(c);
				a=b;
				b=c;
			}
			else
			{
				break;
			}
		}
		
	}
}
