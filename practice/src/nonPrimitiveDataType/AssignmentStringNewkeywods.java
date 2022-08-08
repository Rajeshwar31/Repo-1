package nonPrimitiveDataType;

public class AssignmentStringNewkeywods {

	public static void main(String[] args) {

		String a = new String ("Apple");
		String b = new String ("Mango");
		String c = new String ("Apple");
		String d = new String ("apple");
		
		// Equal data so true not then false
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		//Location ---> All false since new keyword type syntax used
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);





	}

}
