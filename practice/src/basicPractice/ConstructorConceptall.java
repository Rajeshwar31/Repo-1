package basicPractice;

public class ConstructorConceptall 
{
	int eID;
	String eName;
	int eMob;
	String eMail;
	
	
	ConstructorConceptall(String a)
	{
		eID=31;
		eName="Rajeshwar";
		eMob=77769;
		eMail="r@gmail.com";
	}
	
	ConstructorConceptall(int x)
	{
		eID=32;
		eName="Rupesh";
		eMob=7972270;
		eMail="rc@gmail.com";
	}
	void printmethod()
	{
		System.out.println("Name- "+eName);
		System.out.println("Employee Id- "+eID);
		System.out.println("Mob number- "+eMob);
		System.out.println("Email ID- "+eMail);
	}
	public static void main(String[] args) 
	{
		ConstructorConceptall raj = new ConstructorConceptall("Rajeshwar"); 
		raj.printmethod();
		System.out.println();
		ConstructorConceptall rup = new ConstructorConceptall(31);
		rup.printmethod();
		
	}

}
