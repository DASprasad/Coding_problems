package progarm;
import java.util.*;
public class _380_Insert_Delete_GetRandom_Constant_Time {
	
	ArrayList<Integer> list;
	HashMap<Integer , Integer> map;
	
	
	
	_380_Insert_Delete_GetRandom_Constant_Time(){
		list = new ArrayList(); map = new HashMap();
	}
	
	  public int getRandomNumber(int min, int max) { //get rendom number with java library function
	    return (int) ((Math.random() * (max - min)) + min);
	 }
	  
	   public boolean insert(int val) {
	        if(map.containsKey(val)) return false;
	        
	        	list.add(val);
	        	map.put(val, list.size() - 1); //remember index position;
	        
	        	return true;
	    }
	    
	    public boolean remove(int val) {
	    	if(list.size() <= 0) return false;
	    	
	    	int last = list.get(list.size() - 1) ;
	    	
	    	if(val == last) {
	    		map.remove(last);
	    		list.remove(list.size() - 1);
	    	}
	    	
	    	
	    	else if(map.containsKey(val)) {
	    		int index = map.get(val);      //get the index value
	    		map.remove(val);               //remove value from map
	    		list.set(index, last);         //put the last element in the removed value
	    		map.put(last , index);          //update the index in map
	    		list.remove(last);
	    		
	    		return true;
	    	}
	    	
	    	return false;
	        
	    }
	    
	    public int getRandom() {
	        int random = getRandomNumber(0, list.size());
	        
	        return list.get(random);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
