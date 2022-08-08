package basicPractice;

public class ArrayP11 {

		public static void main(String[] args) {

			int arr[]= {20, 30, 11, 50, 5};
			 int temp=0;
			
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
			 }
			 System.out.println("The 2nd largest element in array is "+ arr[1]);
			       
	}

}
