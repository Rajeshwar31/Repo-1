package basicPractice;

public class NumbersP12 {

	public static void main(String[] args) {

		int num1=0, num2=1, num3, n=10;
		System.out.println("Fibonacci Series");
		System.out.print(num1+" "+num2); //it will print the first two numbers i.e 0 & 1 
		for (int i=0; i<n; i++)    //i=0 initial, i<10 condition, i++
		{
			num3= num1+num2;
			System.out.print(" "+num3);
			num1=num2;  //0 num1-->E
			num2=num3;  // num2---> num3
		}
	}

}
