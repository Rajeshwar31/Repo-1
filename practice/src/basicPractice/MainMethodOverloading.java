package basicPractice;

public class MainMethodOverloading {

	public static void main(String[] args) 
	{
		System.out.println(" Main method with string args [] ");
		
		main("raj");
		main();
	}
	public static void main(String args) 
	{
		System.out.println(" Main method with string args ");
	}
	public static void main() 
	{
	   System.out.println(" Main method w/o string args ");	
	  
	}

}
