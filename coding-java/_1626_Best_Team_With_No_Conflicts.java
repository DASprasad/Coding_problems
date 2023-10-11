package progarm;
import java.util.*;
public class _1626_Best_Team_With_No_Conflicts {
	
	public int compare(int[] a , int[] b) {
		if(a[0] > b[0]) return 1;
		else if(a[0] == b[0] && a[1] > b[1]) return 1;
		else return -1;
	}
	
	public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] arr = new int[n][2];
        
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = ages[i]; arr[i][1] = scores[i];
        }
        
        Arrays.sort(arr , (a , b) -> compare(a , b));
        int[] dp = new int[n];
        dp[0] = arr[0][1];
        int res = dp[0];
        
        for(int i = 1 ; i < n ; i++){
            int max = 0;
            for(int j = 0 ; j < i ; j++){
                if(arr[j][1] <= arr[i][1]){
                   max  = Math.max(max , dp[j]);
                }
            }
            dp[i] = max + arr[i][1];
            res = Math.max(res, dp[i]);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1626_Best_Team_With_No_Conflicts ob = new _1626_Best_Team_With_No_Conflicts();
		int[] scores = {1,3,7,3,2,4,10,7,5};
		int[] ages = {4,5,2,1,1,2,4,1,4};
		
		System.out.println(ob.bestTeamScore(scores, ages));

	}

}
