package basicPractice;

public class ArrayP10 {

	public static void main(String[] args) {

		//Duplicate element in array
		
		int x[]= {21, 4, 31, 5, 8, 7, 48, 31, 2};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if (x[i]==x[j])
				{
					System.out.println("The duplicate element in array is:");

					System.out.print(x[j]);
				}
			}
		}
	}

}
