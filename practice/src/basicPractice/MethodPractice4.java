package basicPractice;

public class MethodPractice4 {

	public static void studentsDetails()
	{
		String Name=("Rajeshwar Chaudhari");
		int Roll_no=57;
		char Division='A';
		String Address=("001, C Wing, Vrundawan Complex, Karjat 410201");
		System.out.println(Name);
		System.out.println(Roll_no);
		System.out.println(Division);
		System.out.println(Address);
		
	}
	public static void main(String[] args) {
		studentsDetails();
		System.out.println("1st time");
		System.out.println();
		
		studentsDetails();
		System.out.println("2nd time");
		System.out.println();
	}
}
