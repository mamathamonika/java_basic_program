package array_program;

public class FirstMaxElement {

	public static void main(String[] args) {

		int [] a = {10,50,40,30,20};

		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}

		}

		
			System.out.println("max element in array is : "+ a[a.length-1]);
		
		}

	}
