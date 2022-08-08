package basicPractice;

public class BasicPractice7_06 {              //Date::: 07/06/2022
	//EX.1
	/*int a;
	int b;
	
	

	BasicPractice7_06()
	{
		a=10;
		b=90;
		System.out.println(a+b);
	}
	
	public BasicPractice7_06(int r, int p)
	{
		a=900;
		b=100;
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
	BasicPractice7_06 x = new BasicPractice7_06(); //constructor without args
	BasicPractice7_06 y = new BasicPractice7_06(); // repeatedly you can call constructor even the same 
	
		BasicPractice7_06 r = new BasicPractice7_06(50,60);  // constructor with args
		BasicPractice7_06 p = new BasicPractice7_06(40,30); //  // repeatedly you can call constructor even the same 
	
	}*/
	
	//EX.2 how to call non static method
	
	
	/*void method1()
	{
		System.out.println("Non-static method called");
	}
	public static void main(String[] args) 
	{
		BasicPractice7_06 r = new BasicPractice7_06();
		r.method1();
		
		r.method2(800);
		int m=r.method3(); 
		System.out.println(m);
	}	
		void method2(int i)
		{
		System.out.println("calling non static method written below the main method");	
		}
		
		int method3()
		{
		int a=2022;
		
		System.out.println("return type method w/o args ");
		return a;
		}*/
	//EX. 4
	
	/*public void method4()
	{
		System.out.println("NON STATIC first method");
	}
	public void method5()
	{
		System.out.println("NON STATIC second method");
	}
	public static void main(String[] args) 
	{
		BasicPractice7_06 x = new BasicPractice7_06();
		x.method5();
		x.method4();
	}*/
}
