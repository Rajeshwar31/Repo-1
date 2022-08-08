package nonPrimitiveDataType;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = x.nextInt();
		
		System.out.println("Enter the second number");
		int b = x.nextInt();
		
		int c = a+b;
		System.out.println(c);
	}

}
