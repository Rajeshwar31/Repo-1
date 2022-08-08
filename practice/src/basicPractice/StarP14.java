package basicPractice;

public class StarP14 {

	public static void main(String[] args) {
for(int i=1;i<=5; i++)
{
	for(int j=4; j>=i; j--)
	{
		System.out.print(" ");
	}
	for(int k=1; k<=i; k++)
	{
		System.out.print("*");
	}
	for(int l=2;l<=i; l++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int p=1;p<=4;p++)
{
	for(int q=1; q<=p; q++)
	{
		System.out.print(" ");
	}
	for(int r=4; r>=p; r--)
	{
		System.out.print("*");
	}
	for(int s=3;s>=p;s--)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
