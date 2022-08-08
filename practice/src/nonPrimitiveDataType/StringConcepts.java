package nonPrimitiveDataType;

public class StringConcepts {

	public static void main(String[] args) {

		String x ="Rajeshwar Chaudhari"; //String also prints the spaces between names as shown side line.
		//String Email="rchaudhari990@gmail.com";
		
		// EX  syntax 1 with literal
		
		String R= "Rupesh";
		//same as we declare the variables to any other dataType.
		
		//EX syntax 2 with new keyword
		
		//String t = new String("rchaudhari990@gmail.com");
		//System.out.println(t);
		
		
		// String uses equals method which gives an idea about the value in boolean form
		
		
		String O= "Rupesh";
		String U= "Raj";
		String G="Rupesh";
		String H="Rajeshwar chaudhari";
		// checking now for literals
		System.out.println(O.equals(U));
		System.out.println(O.equals(G));
		System.out.println(H.equals(x));
		System.out.println(R.equals(O));
		System.out.println(O==H); // Location Checking memory allocation concept.--> False
		System.out.println(G==x);//---> False.
		
	}

}
