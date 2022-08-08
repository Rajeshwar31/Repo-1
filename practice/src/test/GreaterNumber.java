package test;

public class GreaterNumber {

	public static void main(String[] args) {
    int A1=50;
    int A2=60;
    int A3=80;
    int A4=90;
    
    if (A1>A2 && A1>A3 && A1>A4) {   // false
    	System.out.println("Greater Value = " + A1);
                                 }
    if (A2>A1 && A2>A3 && A1>A4) {  // false
    	System.out.println("Greater Value =" + A2);
                                 }
    if (A3>A1 && A3>A2 && A3>A4) {  //false
    	System.out.println("Greater Value =" + A3);
                                 }
    if (A4>A1 && A4>A2 && A4>A3) {  // every condition is true
    	System.out.println("Greater Value =" + A4);
                                 }
    System.out.println("--------------------------------------------------------DEMO--------------------------------------------------------------------------------------");
    
    int a=4;
    int raj;
    raj=a;
    System.out.println("var using simple " + raj);
    raj+= a;
    System.out.println("var using  " + raj);
    raj*=a;
    System.out.println("var using  " + raj );
    raj-=a;
    System.out.println("var using  " + raj);
	}

}
