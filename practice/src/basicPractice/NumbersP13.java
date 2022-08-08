package basicPractice;

public class NumbersP13 {

	public static void main(String[] args) {

		int a, x, sum=0;
		int num=6336; // assigned number
		x=num;   // store the number into var.
		while (num!=0)
		{
			a = num%10;
		 sum= (sum *10) + a;
		 num = num/10;
		}
		if (x==sum)
		{
			System.out.println("number is palindrome number");
		}
		else 
		{
			System.out.println("number is not a palindrome number");
		}
	}

}
