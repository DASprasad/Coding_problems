package progarm;
import java.util.*;
public class _802_Find_Eventual_Safe_States {
	
	public boolean dfs(int[][] graph , boolean[] visited , Boolean[] dp , int pos){

        if(visited[pos] == true) return false;
        if(graph[pos].length == 0) return true;
        if(dp[pos] != null) return dp[pos];
        boolean flag = true;
  
        for(int i : graph[pos]){
            visited[pos] = true;
            boolean res = dfs(graph , visited , dp, i);
            visited[pos] = false;
            
            flag = flag && res;
        }
        
        return dp[pos] = flag;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
    	List<Integer> res = new ArrayList();
        Boolean dp[] = new Boolean[graph.length];
        boolean[] visited = new boolean[graph.length];
  
        for(int i = 0 ; i < graph.length ; i++) {
        	if( dfs(graph , visited , dp , i)) {
        		res.add(i);
        	}
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
