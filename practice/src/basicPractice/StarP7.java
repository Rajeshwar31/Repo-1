package basicPractice;

public class StarP7 {

	public static void main(String[] args) {
for (int i=1; i<=10; i++)
{
	for (int j=9; j>=i; j--)
	{
		System.out.print(" ");
	}
	for (int k=1; k<=i; k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for (int y=1; y<=10; y++)
{
	for (int f=1; f<=y; f++)
	{
		System.out.print(" ");
	}
	for(int o=9; o>=y; o--) 
	{
		System.out.print("*");
	}
	System.out.println();

}
	}

}
