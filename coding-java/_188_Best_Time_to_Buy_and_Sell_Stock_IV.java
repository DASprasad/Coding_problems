package progarm;
import java.util.*;
public class _188_Best_Time_to_Buy_and_Sell_Stock_IV {
	
  public int maxProfit(int k, int[] prices) {
//        Stack<Integer> stack = new Stack();
        PriorityQueue<Integer> ups = new PriorityQueue<Integer>(k , (a,b)->b - a);
        PriorityQueue<Integer> downs = new PriorityQueue<Integer>(k , (a,b)->b - a);
        int base = prices[0];
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++) {
        	if(prices[i] < base) {
        		base = prices[i];
        		if(profit != 0) ups.add(profit);
        		profit = 0;
        	}
        		profit = Math.max(profit, prices[i] - base);
        	
        }
         if(profit != 0) ups.add(profit);
          profit = 0;
          base = prices[prices.length - 1];
         for(int i = prices.length - 2 ; i >= 0 ; i++) {
         	if(prices[i] < prices[i + 1]) {
         		base = prices[i];
         		if(profit != 0) downs.add(profit);
         		profit = 0;
         	}
         		profit = Math.max(profit, prices[i] - base);
         	
         }
          if(profit != 0) ups.add(profit);
         
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
