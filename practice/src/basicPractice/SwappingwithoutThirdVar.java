package basicPractice;

public class SwappingwithoutThirdVar {

	public static void main(String[] args) {

		int a=20;
		int b=50;
		/*int c;
		
		c=a;
		a=b;
		System.out.println(a);         using third var.
		b=c;
		System.out.println(b);*/
		
		a=a+b;
		System.out.println(a);
		b=a-b;
		System.out.println("b="+b);
		a=a-b;
		System.out.println("a="+a);
	}

}
