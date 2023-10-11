package progarm;
import java.util.*;
public class _1996_The_Number_of_Weak_Characters_in_the_Game {
	
	public int numberOfWeakCharacters(int[][] properties) {
		Stack<int[]> stack = new Stack();  stack.push(properties[0]);
		
		Arrays.sort(properties , (a , b) -> a[0] - b[0]);
		
		int weakCharacters = 0;
		
		for(int i = 1; i < properties.length ; i++) {
			int defense = properties[i][1];
			while(stack.size() > 0 &&  stack.peek()[1] < defense ) {
				stack.pop(); weakCharacters += 1;
			}
			
			stack.push(properties[i]);
		}
	
		return weakCharacters;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1996_The_Number_of_Weak_Characters_in_the_Game ob = new _1996_The_Number_of_Weak_Characters_in_the_Game();
		

	}

}
