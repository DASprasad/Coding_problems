package progarm;
import java.util.*;
public class _1395_Count_Number_of_Teams {
	
	 public int numTeams(int[] rating) {
	     int teams=0;
	     int countsmaller=0;
	     int countbigger=0;
	     int[] sdp=new int[rating.length];
	     int[] bdp=new int[rating.length];
	     sdp[0]=0; bdp[0]=0;
	     for(int i=1;i<rating.length;i++) {
	    	 for(int j=0;j<i;j++) {
	    		if(rating[i]>rating[j]) {
	    			countsmaller+=1;
	    			if(sdp[j]>0) {
	    				teams+=sdp[j];
	    			}
	    		}
	    		
	    		if(rating[i]<rating[j]) {
	    			countbigger+=1;
	    			if(bdp[j]>0) {
	    				teams+=bdp[j];
	    			}
	    		}
	    		
	    	 }
	    	    sdp[i]=countsmaller;
	    		bdp[i]=countbigger;
	    		countsmaller=0; countbigger=0;
	     }
	     return teams;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1395_Count_Number_of_Teams ob=new _1395_Count_Number_of_Teams();
		int[] rating= {2,3,2,3,4,5,6,7,6,5,4,4,5,6,7,8,7,6,5,4,3,5,6,8,8,8,7,5,4,3,4,56,7,8,9,8,6,5,3,3,3,33,3,54,6,7,8,8,7,5,4,3,4,5,6,7,7,5,4,6,7,8,9,8,7,6,5,4,3};
		System.out.println(ob.numTeams(rating));

	}

}
