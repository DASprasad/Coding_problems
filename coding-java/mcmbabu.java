package progarm;

public class mcmbabu {
     public void babu(int[] arr,int n,int[] help,int dum) {
//    	 if(n>=arr.length) {
//   		 return 0;
// 	     }
    	 
    	 if(n!=0) {
    	help[n]=-1;
    	 }
    	 int sum =0;
    	 for (int j=0;j<help.length;j++) {
    		 sum=sum+help[j];
    	 }
    	 if(Math.abs(sum)==help.length-2) {
    		 System.out.println(dum);
    		 return;
    		 
    	 }
//    	int local=1000000000;
    	 for(int i=1;i<arr.length-1;i++) {
    		 
    	 if(help[i]==-1) {
    		continue;
    	 }
         int k=i-1;
         while(help[k]==-1) {
        	 k--;
         }
         int l=i+1;
         while(help[l]==-1) {
        	 l++;
         }
         dum = dum+arr[k]*arr[i]*arr[l];
    	babu(arr,i,help,dum);
//    		 if(m<local) {
//    			 local=m;
//    			 
//    		 }
//    		 System.out.println(local);
    	 }
    	 
    	 help[n]=arr[n];
//    	 return ; 
     }
	public static void main(String[] args) {
		mcmbabu ob=new mcmbabu();
		int[] arr={40, 20, 30, 10, 30} ;
		int[] help={0,0,0,0,0} ;
		ob.babu(arr, 0, help,0);

	}

}
