package basicPractice;

public class NumbersP5 {

	public static void main(String[] args) {

		int x= 12, y=9, GCD=1;
		for (int i=1; i<=x && i<=y; ++i) //this loop will find GCD 
		{
			if (x%i==0 && y%i==0)
			{
				GCD=i;
			}
		}	
			int LCM =(x*y)/GCD; // formula for LCM
					System.out.println("LCM for given number is "+LCM);
	}

}
