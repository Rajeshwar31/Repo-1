package castingConcept;

public class Imp implements Interface{
	
	void method3()
	
	{
		System.out.println("Imp Class");
		
	}
	void method4()
	{
		System.out.println("Imp Class");
	}
	public static void main(String[] args) 
	{
		
		Interface x = new Imp(); 
		x.method1();
		x.method2();
	}
	@Override
	public void method1() {

		System.out.println("Interface class method 1");
	}
	@Override
	public void method2() {

		System.out.println("Interface class method 1");
	}

}
