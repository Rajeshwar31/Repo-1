package basicPractice;

public class BasicPractice9_6 
{
	// program including each & every concept.
	//Global var.
	String sname;
	int srollNo;
	int sMobNo;
	String emailID;
	String sBatch="02 Aprl Batch";
	
	BasicPractice9_6()
	{
	sname = "Rajeshwar ";
	srollNo = 311;
	sMobNo= 77769;
	emailID= "rchaudhari990@gmail.com";
	//sBatch= "02 Aprl Batch";
	}
	
	BasicPractice9_6(int x)
	{
		sname = "Rupesh";
		 srollNo = 31;
		 sMobNo= 123;
		 emailID= "rupesh@gmail.com";
	     //sBatch= "02 Aprl Batch";
	}
	
	public void printdata()
	{
		System.out.println(" Name "+ sname
				+ " Roll No "+ srollNo
				+ " Mobile No "+sMobNo
				+" Email ID "+ emailID
				+ " Batch "+sBatch);
	}
	public static void main(String[] args) 
	{
		BasicPractice9_6 x = new BasicPractice9_6(); //Rajeshwar Data
		x.printdata();
		
		BasicPractice9_6 y = new BasicPractice9_6(70); //Rupesh Data
		y.printdata();
	}
	
	
	
	
	
	
	
	

}
