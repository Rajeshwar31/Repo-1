package test;

public class PatternsAreFunNow {

	public static void main(String[] args) {
int n=9;

 for(int i=1;i<=n;i++) { //for this pattern we differentiated the 1 as even & 0 as odd.
	 for (int j=1; j<=i; j++) {
		 int sum=i+j;
		 if (sum%2==0) {
			 System.out.print("1 "); //even 
		 }
		 else {
			 System.out.print("0 "); //odd
		 }
	 }
	 System.out.println();
 }
	}

}
