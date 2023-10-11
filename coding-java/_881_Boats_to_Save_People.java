package progarm;
import java.util.*;
public class _881_Boats_to_Save_People {
	
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0; int j = people.length - 1;
        int boats = 0;
        int cur = 0;
        
        while(i <= j) {
        	cur += people[j] + people[i];
        	if(cur > limit) {
        		boats += 1;
        		cur = 0;
        		j --;
        	}
        	else {
        		i++;
        	}
        }
        
        return boats;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_881_Boats_to_Save_People ob = new _881_Boats_to_Save_People();
		int[] people = {3,5,3,4};
		int limit = 5;
		
		System.out.println(ob.numRescueBoats(people, limit));

	}

}
