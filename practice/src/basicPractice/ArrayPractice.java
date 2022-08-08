package basicPractice;

public class ArrayPractice {

	public static void main(String[] args) {

		int a []= {23,365,52,47,58,96,34,254};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i; j<a.length-i-1;j++)
			{
				if (a[j]<a[j+1])
				{
					int temp=a[j];   //temp = 23
					a[j]=a[j+1];     //A[j]=24  a[j+1]=empty
					a[j+1]=temp;     //a[j+1]= 23
				}
				
			}
		}
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
