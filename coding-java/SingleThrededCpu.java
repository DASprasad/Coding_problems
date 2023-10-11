package progarm;
import java.util.*;
public class SingleThrededCpu {
	
	public int[] sequence(int[][] tasks) {
//  	  int[] ob=new int[3];
  	  ArrayList<Integer>ans=new ArrayList();
  	  
  	  int[][] arr=new int[tasks.length][tasks[0].length+1];
  	  PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) ->a[1]-b[1]); 

  	  for(int i=0;i<tasks.length;i++) {
  		  arr[i][0]=tasks[i][0];
  		  arr[i][1]=tasks[i][1];
  		  arr[i][2]=i;
  	  }
  	  Arrays.sort(arr , (a,b)->a[0]-b[0]);
  	  int time=0 ; 
  	  int i=0;
  	  int[] temp=new int[2];
  	  temp[1]=arr[0][0];
  	  
  	  while(i<arr.length) {
  		   time=time+temp[1];
  		  while (i<tasks.length && time>=arr[i][0]) {
   			 pq.add(arr[i]);
   			 i++;
   		}
  		     temp=pq.poll();
  		     ans.add(temp[2]);
  		    
  	    } 
  	  
  	  
  		  while(pq.size()>0) {
  			  int[] tem=pq.poll();
  			  ans.add(tem[2]);
  		  }
  		 
  		  int[] ob=new int[ans.size()];
  		  for(int j=0;j<ans.size();j++) ob[j]=ans.get(j);
  	  
  	     return ob;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThrededCpu ob=new SingleThrededCpu();
		int[][] tasks= {{7,10},{7,12},{7,5},{7,4},{7,2}};
		System.out.println(Arrays.toString(ob.sequence(tasks)));

	}

}
