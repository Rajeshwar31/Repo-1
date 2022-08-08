package basicPractice;

public class NestedforloopSocietyBasic {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		System.out.println("Society " + i);
		
		for(int j=1; j<=5; j++)
		{
			System.out.println(" Flat" + j);
		}
		System.out.println("Out of Innermost loop");
	}
	System.out.println("Out of Outermost Loop");
}
}
