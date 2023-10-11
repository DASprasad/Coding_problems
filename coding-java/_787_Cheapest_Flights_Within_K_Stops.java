package progarm;
import java.util.*;
public class _787_Cheapest_Flights_Within_K_Stops {
	
	//slightly modified version of bell man fords algorithm
	//in BMF algo we were keeping only one cost array and updating it simultaneously for n times
	//by that way we could get the result of n distance vertice from source in less than or equal to n times repeatition
	//but in this logic at each step we make sure that we are reaching upto that step distance of vertices from source
	//ex when n = 2 , we know that we have all the result of vertices 2 those are 2 distance from the source(not < 2 0r > 2)
	//we achieve that by using another temp array.
	class Solution {
	    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K)
	    {
	        int[] cost=new int[n];
	        Arrays.fill(cost,Integer.MAX_VALUE);
	        cost[src]=0;
	        for(int i=0;i<=K;i++)
	        {
	            int[] temp= Arrays.copyOf(cost,n);
	            for(int[] f: flights)
	            {
	                int curr=f[0],next=f[1],price=f[2];
	                if(cost[curr]==Integer.MAX_VALUE)
	                    continue;
	                temp[next]=Math.min(temp[next],cost[curr]+price);
	            }
	            cost=temp;
	        }
	        return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_787_Cheapest_Flights_Within_K_Stops ob = new _787_Cheapest_Flights_Within_K_Stops();
		int n = 4;
		int[][] flights = {{0,1,1},{0,2,5},{1,2,1},{2,3,1}};
		int src = 0 , dst = 3, k = 1;
		
//		System.out.println(ob.findCheapestPrice(n, flights, src, dst, k));
	}

}
