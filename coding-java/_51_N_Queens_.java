package progarm;
import java.util.*;
public class _51_N_Queens_ {
	HashSet<Integer> horizontal = new HashSet();
	HashSet<Integer> vertical = new HashSet();
	HashSet<Integer> diagonal1 = new HashSet();
	HashSet<Integer> diagonal2 = new HashSet();
	int size ;
	public boolean isSafe(int row , int col) {
		if(horizontal.contains(row) || vertical.contains(col) || diagonal1.contains(row - col) || diagonal2.contains(row + col)) {
			return false;
		}
		return true;
	}
	
	public void backtracking(char[] arr , int row , int n , List<String> list , List<List<String>> res) {
		if(n == 0) {
			res.add(new ArrayList(list));
			return;
		}
		if(row >= size) {
			return;
		}
		
		for(int col = 0 ; col < size ; col++) {
			if(isSafe(row , col)) {
				arr[col] = 'Q';
				horizontal.add(row); vertical.add(col);
				diagonal1.add(row - col); diagonal2.add(row + col);
				list.add(String.valueOf(arr));
				arr[col] = '.';
				backtracking(arr , row + 1 , n - 1 , list , res); 
				if(list.size() > 0) list.remove(list.size() - 1);
				horizontal.remove(row); vertical.remove(col);
				diagonal1.remove(row - col); diagonal2.remove(row + col);
			}
		}
	}
	
   public List<List<String>> solveNQueens(int n) {
       size = n;
        List<List<String>> res = new ArrayList<List<String>>();
        char arr[] = new char[n];
        for(int i = 0; i < arr.length ; i++) arr[i] = '.';
        
        backtracking(arr , 0 , n , new ArrayList<String>() , res);
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_51_N_Queens_ ob = new _51_N_Queens_();
		int n = 4;
		
		System.out.println(ob.solveNQueens(n));

	}

}
