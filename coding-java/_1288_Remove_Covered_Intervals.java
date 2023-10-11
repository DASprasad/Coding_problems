package progarm;
import java.util.*;
public class _1288_Remove_Covered_Intervals {
	
  public int removeCoveredIntervals(int[][] intervals) {
        int ans=1;
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1] : a[0]-b[0]);   //sort by starting values
        
        int end  =intervals[0][1];
        
        for(int i=1;i<intervals.length;i++) {
        	
        	if(intervals[i][1]>end) {
        		ans+=1;
        		end=intervals[i][1];
        	}
        }
        
        
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1288_Remove_Covered_Intervals ob=new _1288_Remove_Covered_Intervals();
		
		int[][] nums= {{1,3},{1,4},{3,6},{2,8}};
		System.out.println(ob.removeCoveredIntervals(nums));

	}

}
