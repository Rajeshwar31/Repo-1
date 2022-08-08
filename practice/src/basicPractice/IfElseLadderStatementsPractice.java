package basicPractice;

public class IfElseLadderStatementsPractice {
	public static void main(String[] args) {
		
		int Marks = 50;
		if (Marks>= 91 && Marks<=100)
		{
			System.out.println("A Grade");
		}
		else if (Marks>=81 && Marks<=90)
		{
			System.out.println("B Grade");
		}
		else if( Marks>=71 && Marks<=80)
		{
			System.out.println("C Grade");
		}
		else if (Marks>=50 && Marks<=70)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
	System.out.println("End of Program");
	}

}

