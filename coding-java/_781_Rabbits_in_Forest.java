package progarm;
import java.util.*;
public class _781_Rabbits_in_Forest {
	
	public int numRabbits(int[] answers) {
		HashMap<Integer , Integer> map = new HashMap();
		int res = 0;
        for(int i = 0 ; i < answers.length ; i++) map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
        	int num = entry.getKey() + 1;
        	int count = entry.getValue();
        	res +=  (count / num)*num + (count % num != 0 ? num : 0);	
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
