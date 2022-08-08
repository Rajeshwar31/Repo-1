package nonPrimitiveDataType;

public class StringWithoutlengthMethod {

	public static void main(String[] args) {

		// Size/Length of the string w/o using .length method
		
		String s = "Hello There";
		System.out.println(s.lastIndexOf("")); //1st method
		int count=0;
		for (char a : s.toCharArray())
		{
			count++;
		}
	
		System.out.println(count); //2nd method
		
	}

}
