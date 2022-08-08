package basicPractice;

public class ArrayP3 {

	public static void main(String[] args) {

		int a []= {23,365,52,47,58,96,34,254};
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i] + " Even Number");
	
			}
			else
			{
				System.out.println(a[i] + " Odd Number");
			}
		}
	}
}
