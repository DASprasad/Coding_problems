package progarm;
import java.util.*;
public class _939_Minimum_Area_Rectangle {
	
	public int minAreaRect(int[][] points) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] p : points) {
            if (!map.containsKey(p[0])) {
                map.put(p[0], new HashSet<>());
            }
            map.get(p[0]).add(p[1]);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < points.length ; i++) {
        	int[] p1 = points[i];
            for (int j = i + 1; j < points.length ; j++) {
            	int[] p2 = points[j];
            	
                if (p1[0] == p2[0] || p1[1] == p2[1]) { // if have the same x or y rectangle is impossible
                    continue;
                }
                
                if (map.get(p1[0]).contains(p2[1]) && map.get(p2[0]).contains(p1[1])) { // find other two points bc we have two diagonals
                    min = Math.min(min, Math.abs(p1[0] - p2[0]) * Math.abs(p1[1] - p2[1]));
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
