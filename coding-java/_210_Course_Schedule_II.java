package progarm;
import java.util.*;
public class _210_Course_Schedule_II {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        Queue<Integer> q = new LinkedList();
        int[] degree = new int[numCourses];
        
        for(int i = 0 ; i < graph.length ; i++) graph[i] = new ArrayList();
        
        for(int i = 0 ; i < prerequisites.length ; i++) {  //prepare adjacent list
        	degree[prerequisites[i][0]] ++;
        	graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        int count = 0;
        for(int i = 0 ; i < degree.length ; i++) { //if degree od node is zero add it to initial queue
        	if(degree[i] == 0) {
                q.add(i);
 	        	count ++;
            }
        }
       int res[] = new int[numCourses]; int pos = 0;  
        
        while(!q.isEmpty()) {
        	int u = q.poll();
        	res[pos ++] = u;
        	for(int i = 0 ; i < graph[u].size(); i++) {
        		int v = graph[u].get(i);
        		degree[v] --;
        		
        		if(degree[v] == 0) {
        			q.add(v); count += 1;
        		}
        	}
        }
        return count == numCourses ? res : new int[0];
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
