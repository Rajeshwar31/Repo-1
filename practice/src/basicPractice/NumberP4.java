package basicPractice;

public class NumberP4 {

	public static void main(String[] args) {
		int a=24, b=36, GCD=1;   //Initialize
		for (int i=1; i<=a && i<=b; i++) //this loop will run from 1 to smaller no.
		{
			if (a%i==0 && b%i==0)   //if both conditions are true
				GCD=i;              // store the variable i in GCD.
		}
		System.out.println("The GCD of given two no. "+GCD);

	}

}
