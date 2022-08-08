package basicPractice;

public class starP11 {

	public static void main(String[] args) {
for (int i=1;i<=10;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=10;k>=i;k--)
	{
		System.out.print("* ");
	}
	System.out.println();
}
for(int p=1; p<=10 ;p++)
{
	for(int q=9; q>=p ;q--)
	{
		System.out.print(" ");
	}
	for(int r=1; r<=p; r++)
	{
		System.out.print(" *");
	}
	System.out.println();
}

	}
}