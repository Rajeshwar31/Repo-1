package test;

public class If_Else {

	public static void main(String[] args) {
    int marks=9;
    if (marks==100) {
    	System.out.println(" Great you nailed it with Out-off ");
                    }
    else if (marks<100 && marks>=90) {
    	System.out.println(" You've got A Grade ");
                    }
    else if (marks<100 && marks>=70) {
    	System.out.println(" You've got B Grade ");
                    }
    else if (marks<100 && marks>=50) {
    	System.out.println(" You've got C Grade ");
                    }
    else {
    	System.out.println(" You Failed DumbAss ");
         }
	}

}
