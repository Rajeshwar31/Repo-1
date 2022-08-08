package castingConcept;

public class Subclass extends SuperClass {

	public void method3()
	{
		System.out.println(" SUB CLASS method 3");
		
	}
	public void method4()
	{
		System.out.println(" SUB CLASS method 4");
	}
	
	public static void main(String[] args) {
		
		Subclass x = new  Subclass();
		x.method1(); // ParentClass
		x.method2();  // ParentClass
		
		
		x.method3(); //ChildClass
		x.method4(); //ChildClass
		
		
		SuperClass v = new Subclass();
		v.method1();
		v.method2();
		
		
	}




}

