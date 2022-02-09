package JavaProg;

public class SwapTwoNumWithout3rdVariable {

	public static void main(String[] args) {
		
		Integer a=20;
		Integer b=10;
		System.out.println("befor swaping a:"+a);
		System.out.println("befor swaping b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a:"+a);
		System.out.println("after swaping b:"+b);
		

	}

}
