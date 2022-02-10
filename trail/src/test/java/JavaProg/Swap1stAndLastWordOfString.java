package JavaProg;

public class Swap1stAndLastWordOfString {

	public static void main(String[] args) {

		String s = "welcome to tyss company";
		
		String[] ar = s.split(" ");
		String temp = ar[0];
		ar[0]=ar[ar.length-1];
		ar[ar.length-1]=temp;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
