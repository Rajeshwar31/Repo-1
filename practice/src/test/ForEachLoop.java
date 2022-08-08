package test;

public class ForEachLoop {

	public static void main(String[] args) { //for each loop with array concept for data collections.
		
		
		double j[]= {10.2,20.3,30.4,40.5,50.6,60.7};  
		 for (double z: j) {
			 System.out.println(z);
		 }
		 System.out.println("=============================================================================================");
 char o[]= {'T','O','T','A','L','='};
 for (char w:o) {
	 System.out.print(w);
 }
 double sum= j[0]+j[1]+j[2]+j[3]+j[4]+j[5];
 System.out.println(sum);
 
 
 System.out.println("===================Break & Continue Statement with switch============================================");
 
 
  String language=""; //input language.
  switch(language) {
  case "M": System.out.println("Marathi");
  break;
  case "H": System.out.println("Hindi");
  break;
  case "E": System.out.println("English");
  break;
  case "F": System.out.println("French");
  break;
  case "G": System.out.println("German");
  break;
  default:System.out.println("No Language Selected Here");
  }
  
 for (int p=1; p<=100; p++) {
	 if (p>10) continue;
		 
	 
	 
	 System.out.print(p +" ");
 }
	}

}
