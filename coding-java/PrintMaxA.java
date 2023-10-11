package progarm;

public class PrintMaxA {
	 public int keys(int number,int prev,int count,String str,String str1,int[] arr){
	        if(number<=0){
	            return count;
	        }
	   
	        
	        if(str.equals("ctrl-V1") && str1.equals("A")){
	            return count;
	        }
	        
	        if(str.equals("A") && !str1.equals("A")){
	            return count;
	        }
	        else if(str.equals("A")) {
	        	count=count+1;
	        	prev=count;
	        }
	        
	        if(str.equals("ctrl-V")){
	        	prev=count;
	            count=count*2;
	        }
	        
	         if(str.equals("ctrl-V1")){
	            count=count+prev;
	        }
	   
	       
	        int m=keys(number-1,prev,count,"A",str,arr);
	        int n=keys(number-3,prev,count,"ctrl-V",str,arr);
	        int k=keys(number-1,prev,count,"ctrl-V1",str,arr);
	        
	        int j=Math.max(m,n);
	        // arr[number]=Math.max(j,k);
	        return Math.max(j,k);
	    }

	public static void main(String[] args) {
		PrintMaxA ob=new PrintMaxA();
		String str="A";
		String str1="A";
		int value=1;
		int[] arr=new int[value+1];
		System.out.println(ob.keys(value,0,0,str,str1,arr));

	}

}
