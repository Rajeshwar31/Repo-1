package basicPractice;

public class ConstructorConcept {
	int a;
	int b;
	ConstructorConcept()
	{
		a=100;
		b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println("HII");
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		ConstructorConcept x = new ConstructorConcept();
		System.out.println(x.a);
	}

}
