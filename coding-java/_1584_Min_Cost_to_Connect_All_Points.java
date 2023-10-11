package progarm;
import java.util.*;
public class _1584_Min_Cost_to_Connect_All_Points {
	
	public int manhattan_Distance(int[] x , int[] y){
        int x1 = x[1] , y1 = x[2] , x2 = y[0] , y2 = y[1];
        return Math.abs(x2 - x1) + Math.abs(y1 - y2);
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length , cost = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(1000000 , (a , b) -> a[0] - b[0]);
        HashSet<Integer> visited = new HashSet();
        pq.add(new int[]{0 , points[0][0] , points[0][1] , 0});
        
        while(visited.size() != n){
            int[] cur = pq.remove(); 
            int idx = cur[3];
            if(visited.contains(idx)) continue;
            cost += cur[0];
            visited.add(idx);
            for(int i = 0 ; i < n ; i++){
                if((i == idx) || visited.contains(i)) continue;
                int cur_cost = manhattan_Distance(cur , points[i]);
                pq.add(new int[] {cur_cost, points[i][0] , points[i][1] , i});
            }
        }
        
        return cost;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1584_Min_Cost_to_Connect_All_Points ob = new _1584_Min_Cost_to_Connect_All_Points();
		int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
		
		System.out.println(ob.minCostConnectPoints(points));

	}

}
