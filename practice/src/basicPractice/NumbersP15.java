package basicPractice;

public class NumbersP15 {

	public static void main(String[] args) {

		int num=153;
		int t1= num;
		int length=0;
		
		while (t1!=0)
		{
			t1= t1/10; //quotient
			length=length+1; //1
		}
		int t2 = num;
		int arm=0;
		int rem;
		while(t2 != 0) 
		{
			int mul=1;
			rem = t2%10; // 3 ,,5,,1 
			for(int i=1;i<=length;i++) 
			{
				mul=mul*rem; //3 ,,9,,27 // 5,,25,,125//1,,1,,1
			}
			arm=arm+mul; //0+27=27 + 125= 152 +1 = 153
			t2=t2/10; // 15,,1 ,,0
		}
		if(arm==num)
		{
			System.out.println(num + " is armstrong number");
		}
		else 
		{
			System.out.println(num + " is not armstrong number");
		}
	}

}
