package basicPractice;

public class NestedforloopAPattern {
public static void main(String[] args) {
	
	for(int i=1; i<=5;i++)   //Outer Loop steps: 1-2-7
	{
	
		for (int j=1; j<=5; j++)  //Inner Loop steps:  3-4-5-6 when inner becomes false- next line then 7
		{
			System.out.print(" A ");
		}
		System.out.println();
	}
}
}
