package array_program;

public class SegrigateZerosAndNum {

	public static void main(String[] args) {

		int [] ar = {1,0,3,0,2,0};
		int [] b = new int [ar.length];
		int m = 0;   //1st index
		int n = b.length-1;   //last index 
		
		for (int i = 0; i < ar.length; i++) {
			
			if(ar[i]==0)
			{
				b[n]=ar[i];
				n--;
			}
			else
			{
				b[m]=ar[i];
				m++;
			}
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]+" ");
			
		}

	}

}
