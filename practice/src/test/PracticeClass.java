package test;

public class PracticeClass {

	public static void main(String[] args) {

		
		 int c[]= {44,25,32,31,31,03,01,11,99};
		 int total=0;
		for (int g:c) {
		total= total + g;
		}
		System.out.println("Total= "+ total);
	
	System.out.println("====================================================*******END*******==========================================================================================================================");
	
	String Days="fri";
	switch (Days) {
	case "mon":System.out.println("Monday");
	break;
	case "tue":System.out.println("Tuesday");
	break;
	case "wed":System.out.println("Wednersday");
	break;
	case "thur":System.out.println("Thursday");
	break;
	case "fri":System.out.println("Friday");
	break;
	case "sat":System.out.println("Saturday");
	break;
	case "son":System.out.println("Sunday");
	break;
	case "":System.out.println(" No input in field Above ");
	}
	int y=1;
	do {
		System.out.print(y);
		y++;
	}
	while (y<=10);
	System.out.println();
	System.out.println("========================================************FOR LOOP*******==================================================");
	
	
	
	
	}
	

}
