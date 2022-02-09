package JavaProg;

public class SwapString {

	public static void main(String[] args) {
		
		String a ="TEST";
		String b="hi";
		
		System.out.println("before swap a :"+a);
		System.out.println("before swap b :"+b);
		
		a=a+b;
		//System.out.println(a.length()-b.length());
	    b=a.substring(0, a.length()-b.length());
	    a=a.substring(b.length(),a.length());
	
	    System.out.println("after swap a :"+a);
		System.out.println("after swap b :"+b);
	}
}
