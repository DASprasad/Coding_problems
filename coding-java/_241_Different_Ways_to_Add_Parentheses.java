package progarm;
import java.util.*;
public class _241_Different_Ways_to_Add_Parentheses {
	
	public int compute(int a , int b , String c) {
		if(c .equals("*")) return a * b;
		else if(c .equals("-")) return a - b;
		else return a + b;
	}
	
	public List<Integer> diffWaysToCompute(String expression) {
		
		List<String> list = new ArrayList();
		for(int i = 0; i < expression.length(); i ++){
	        int j = i;
	        while(j < expression.length() && Character.isDigit(expression.charAt(j)))
	            j ++;
	        String num = expression.substring(i, j);
	        list.add(num);
	        if(j != expression.length())  list.add(expression.substring(j , j + 1));
	        i = j;
	    }
		
		int n = list.size();
		
		List<Integer>[][] dp = new ArrayList[n][n];
		
		for(int gap = 0 ; gap < n ; gap += 2) {
			
			for(int j = gap , i = 0 ; j < n ; j += 2 , i += 2) {
				
				if(j - i == 0) {
					dp[i][j] = new ArrayList();
					dp[i][j].add(Integer.parseInt(list.get(i)));
				}
				
				else if(j - i == 2) {
					dp[i][j] = new ArrayList();
					int a = Integer.parseInt(list.get(i));
					int b = Integer.parseInt(list.get(j)); 
					int val = compute(a , b , list.get(i + 1));
					dp[i][j].add(val);
				}
				else {
					 dp[i][j] = new ArrayList();
					 
					for(int k = i ; k < j ; k += 2) {
						
						String s = list.get(k + 1);
						List<Integer> l1 = dp[i][k];
						List<Integer> l2 = dp[k + 2][j];
						for(int p = 0 ; p < l1.size(); p++) {
							int a = l1.get(p);
							
							for(int q = 0 ; q < l2.size(); q++) {
								int b = l2.get(q);
								int val = compute(a , b , s);
								dp[i][j].add(val);
							}
						}
					}
				}
				
			}
		}
		
		return dp[0][dp.length - 1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_241_Different_Ways_to_Add_Parentheses ob = new _241_Different_Ways_to_Add_Parentheses();
		
		String expression = "2*30-4*5";
//		int n = expression.length();
		
		System.out.println(ob.diffWaysToCompute(expression));
		

	}

}
