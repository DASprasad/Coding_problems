package progarm;

import java.util.Arrays;

public class _838_Push_Dominoes {
	

	public String pushDominoes(String dominoes) {
		char[] dominos = dominoes.toCharArray();
		int lastSeen = -1;
		int[] dp = new int[dominos.length];
		for(int i = dominos.length - 1 ; i >= 0 ; i--) {
			if(dominos[i] == 'L') {
				lastSeen = i;
			}
			if(lastSeen !=-1 && dominos[i]=='.') dominos[i] = 'L';
			
			if( i != dominos.length && lastSeen != -1 && dominos[i] == 'R' && dominos[i + 1] != 'R') {
				int dist = lastSeen - i;
				dp[i] = dist;
				if(dist % 2 == 0) dominos[i + dist / 2] = '.';
				lastSeen = -1;
			}
		}
		int count = 0;
		for(int i = 0 ; i < dominos.length ; i++ ) {
			if(dominos[i] == 'R' && dp[i] > 0) {
				int dist = dp[i] / 2;
				if(dp[i] % 2 == 1) count = dist + 1; 
				else count = dist;
			}
			if(count > 0) {
				dominos[i] = 'R';
				count--;
			}
		}
		
		String res = "";
		for(int i = 0 ; i < dominos.length ; i++) {
			res += dominos[i];
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_838_Push_Dominoes ob = new _838_Push_Dominoes();
		String str ="RR.L..RRR";
		
		System.out.println(ob.pushDominoes(str));

	}

}
