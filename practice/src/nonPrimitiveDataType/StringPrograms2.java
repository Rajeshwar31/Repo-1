package nonPrimitiveDataType;

public class StringPrograms2 
{

	public static void main(String[] args) 
	{
		//7. Java program to find the duplicate characters in a string
				/* String a = "RajeshwarChaudhari";
				int Count = 0;
				System.out.println("The Length is: "+ a.length());
				char[] b = a.toCharArray();     //Converting String to Char Array
				for(int i = 0; i<b.length; i++)   //to iterate the string
				{
				   for(int j= i+1; j<b.length; j++)  //it will iterate the entire string 
				   {
					   if(b[i] == b[j])   //Comparison between two Char
					   {
						  System.out.println("The Duplicate Characters are: "+ b[j]);
						  Count++;
					   }
				   }
				}
			     System.out.println("The Duplicate Char TotalCount is: "+ Count); */
		
		// 8 frequency 
		
		String input_string = "RajeshwarChaudhari";
	      System.out.println("The string is defined as: " +input_string);
	      char input_character = 'r';
	      System.out.println("The character is defined as: " +input_character);
	      int counter = 0;
	      for(int i = 0; i < input_string.length(); i++) {
	         if(input_character == input_string.charAt(i)) {
	            ++counter;
	         }
	      }
	      System.out.println("The frequency of " + input_character + " is " + counter );

	}

}
