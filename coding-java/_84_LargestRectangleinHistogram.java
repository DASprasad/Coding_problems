package progarm;
import java.util.*;
public class _84_LargestRectangleinHistogram {
	
	public int histogram(int[] heights) {
		ArrayDeque<Integer>s=new ArrayDeque();
		int[] cache=new int [heights.length];
//		Stack<Integer> s=new Stack();
		s.add(heights.length-1);
		cache[cache.length-1]=heights[heights.length-1];
		for(int i=heights.length-2;i>=0;i--) {
			if(heights[i]>heights[i+1]) {
				s.add(i);
				cache[i]=heights[i];
			}
			else {
				while(s.size()>0 && heights[i]<=heights[s.peek()]) {
					s.pop();
				}                                                      //{7,6,5,4,5,5,6,7,6,5}
				int temp=0;
				if(s.size()==0) {
				    temp=cache[i]+heights[i]*((heights.length)-i);
				}
				else {
					temp=cache[i]+heights[i]*((s.peek()-i));
				}
				cache[i]=temp;
				s.add(i);
			}
		}
		s.clear();
		int ans=cache[0];
		s.add(0);
		for(int i=1;i<heights.length;i++) {
			if(heights[i]>heights[i-1]) {
				s.add(i);
				ans=Math.max(ans, cache[i]);
			}
			else {
				while(s.size()>0 && heights[i]<=heights[s.peek()]) {
					s.pop();
				}
				int temp;
				if(s.size()==0) {
				temp=cache[i]+heights[i]*(i-0);
				}
				else {
					temp=cache[i]+heights[i]*(i-(s.peek()+1));
				}
				ans=Math.max(ans, temp);
				s.add(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _84_LargestRectangleinHistogram ob=new  _84_LargestRectangleinHistogram();
		 int nums[]= {7,4,3,4};
		 System.out.println(ob.histogram(nums));

	}

}
