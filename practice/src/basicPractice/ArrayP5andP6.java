package basicPractice;

public class ArrayP5andP6 {

	public static void main(String[] args) {

		int a []= {23,365,52,47,58,96,34,254};
		int max= a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		
	    }
		 System.out.println(max);
		
	}

}
