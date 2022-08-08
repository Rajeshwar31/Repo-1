package test;

public class PatternsOP {

	public static void main(String[] args) {
int n=10;
for (int i=1; i<=n; i++) {
	// here two inner loops will occur. (first to print spaces)
	for (int j=1; j<=n-i; j++) {
		System.out.print(" ");
	}
	for (int j=1; j<=i; j++) {   //star printing loop.
		System.out.print("* "); //here we can print pyramid as well as inverted right angled triangle adding starts from 
	}                           // right to left. By just the removing space in star in print(*_);
	System.out.println(); 
}
	}

}
