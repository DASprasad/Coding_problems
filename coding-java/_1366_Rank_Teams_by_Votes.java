package progarm;
import java.util.*;
public class _1366_Rank_Teams_by_Votes {
	
	public int comparision(Character a , Character b ,int[][] dp) {
		
		for(int i = 0 ; i < 26 ; i++) {

			if(dp[a - 'A'][i] != dp[b - 'A'][i]) return  dp[b - 'A'][i] - dp[a - 'A'][i] ; 
		}
		
		return a - b;
	}
	
    public String rankTeams(String[] votes) {
    	String res ="";
    	
    	int[][] dp = new int[26][26];
    	
    	for(int i = 0 ; i < votes.length ; i++) {
    		
    		String s = votes[i];
    		
    		for(int j = 0 ; j < s.length() ; j++) {
    			
    			dp[s.charAt(j) - 'A'][j]++;
    		}
    	}
    	
    	Character[] temp = new Character[votes[0].length()];
    	
    	for(int i = 0 ; i < votes[0].length(); i++) temp[i] = votes[0].charAt(i); //Character object array cause we can sort it ppretty easily
    	
    	Arrays.sort(temp , (a,b)->comparision(a , b , dp));
    	
    	for(int i = 0 ; i < temp.length ; i++) res += temp[i]; //finally get the result after sorting it special way
    	
    	return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1366_Rank_Teams_by_Votes ob = new _1366_Rank_Teams_by_Votes();
		
		String arr[] = {"WXYZ","XYZW"};
		
		System.out.println(ob.rankTeams(arr));

	}

}
