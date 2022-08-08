package inheritance_OverRiding;

public class ChildClass extends ParentClass
{

	public void method1()
	{
		System.out.println("Child class method available overrinding concept");
	}
	
	public static void main(String[] args) 
	{
 
		ChildClass r = new ChildClass();
		System.out.println(r.a);
		r.method1();
		
	}

}
