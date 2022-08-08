package AbstractConcept;

public class ConcreteClass extends AbstractClass 
{
	
	@Override
	public void method4() 
	{
		System.out.println("abstract class method 4");
	}
	
	public static void main(String[] args) 
	{
	
		ConcreteClass x = new ConcreteClass();
		x.method4(); 
		
// parent will not use the phone now since it is passed on to the child. i.e abstract class's incomplete method will be 
// used by concrete class and will be declared in main method above as a concrete class member.
		
		
		
	}


		

}
