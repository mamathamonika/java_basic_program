package array_program;

public class AddArrayOfDiffLength {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6};

		int count = a.length;

		if(b.length>a.length)
		{
			count=b.length;
		}

		for (int i = 0; i < count ; i++) {

			try  // executes 5 times
			{
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {   // executes 2

				if(b.length>a.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
