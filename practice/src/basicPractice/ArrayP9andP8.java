package basicPractice;

public class ArrayP9andP8 {

	public static void main(String[] args) {

		int arr[]= {20, 30, 11, 50, 5};
		 int temp=0;
		 System.out.println("Element of orignal array");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 for(int i=0;i<arr.length;i++)
		 {       
			 for(int j=i+1;j<arr.length;j++)
			 {									      
				 if(arr[i]>arr[j])				
				 {									
							
					 temp=arr[i];							
					 arr[i]=arr[j];						
					 arr[j]=temp;					
				 }								
				 										
			 }
			 System.out.println();
		 }									
		     System.out.println("Element of array sorted in asending order");
		     
		     for(int i=0;i<arr.length;i++)
		 	 System.out.print(arr[i]+" ");    
	}

}

