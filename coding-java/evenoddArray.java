package progarm;

public class evenoddArray {
	public static int arrangeOddAndEven(int arr[], int n)
	{
	    int oddInd = 1;
	    int evenInd = 0;
	    int count=0;
	    while (true)
	    {
	        while (evenInd < n && arr[evenInd] % 2 == 0)
	            evenInd += 2;
	              
	        while (oddInd < n && arr[oddInd] % 2 == 1)
	            oddInd += 2;
	              
	        if (evenInd < n && oddInd < n)
	            {
	                int temp = arr[evenInd];
	                arr[evenInd] = arr[oddInd];
	                arr[oddInd] = temp;
	                count=count+1;
	            }
	              
	        else
	            break;
	    }
	    return count;
	}
	  
	// function to print the array
	
	      
	// Driver function 
	public static void main(String argc[]){
	    int arr[] = { 3, 6, 12, 1, 5, 8 };
	    int n = 6;
	  
	    
	  
	    System.out.println( arrangeOddAndEven(arr, n));
	  
	    
	    
	}
}
