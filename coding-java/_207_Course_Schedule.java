package progarm;
import java.util.*;
public class _207_Course_Schedule {
	
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	        ArrayList<Integer>[] graph = new ArrayList[numCourses];
	        Queue<Integer> q = new LinkedList();
	        int[] degree = new int[numCourses];
	        
	        for(int i = 0 ; i < graph.length ; i++) graph[i] = new ArrayList();
	        
	        for(int i = 0 ; i < prerequisites.length ; i++) {
	        	degree[prerequisites[i][0]] ++;
	        	graph[prerequisites[i][1]].add(prerequisites[i][0]);
	        }
	        int count = 0;
	        for(int i = 0 ; i < degree.length ; i++) {
	        	if(degree[i] == 0) { q.add(i); count ++; }
	        	
	        }
	        
	        while(!q.isEmpty()) {
	        	int u = q.poll();
	        	
	        	for(int i = 0 ; i < graph[u].size(); i++) {
	        		int v = graph[u].get(i);
	        		degree[v] --;
	        		
	        		if(degree[v] == 0) {
	        			q.add(v); count += 1;
	        		}
	        	}
	        }
	        return count == numCourses ? true : false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _207_Course_Schedule ob = new  _207_Course_Schedule();
		 
		 int pre[][] = {{0,1}};
		 int n = 2;
		 
		 System.out.println(ob.canFinish(n, pre));

	}

}
