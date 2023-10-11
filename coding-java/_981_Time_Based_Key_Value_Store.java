package progarm;
import java.util.*;
public class _981_Time_Based_Key_Value_Store {
	
	class TimeMap {
		   class object{
		       String key; int time;
		       public object(String key , int time){
		           this.key = key; this.time = time;
		       }
		   }
		    
		    HashMap<String , List<object>> map;
		    public TimeMap() {
		        map = new HashMap();
		    }
		    
		    public void set(String key, String value, int timestamp) {
		        if(!map.containsKey(key)){
		            object ob = new object(value , timestamp);
		            List<object> list = new ArrayList();
		            list.add(ob);
		            map.put(key , list);
		        }
		        else{
		            List<object> list = map.get(key);
		            list.add(new object(value , timestamp));
		            map.put(key ,list);
		        }
		    }
		    
		    public String get(String key, int timestamp) {
		        List<object> list = map.get(key);
		        
		        if(!map.containsKey(key) || list.get(0).time > timestamp) return "";
		        
		        int low = 0 , high = list.size() - 1;

		        int mid = 0;
		        
		        while (low + 1 < high){     //binary search to find stamp
		             mid = (low + high)/2; 
		            if(list.get(mid).time == timestamp) return list.get(mid).key;
		            else if(list.get(mid).time < timestamp) low = mid ;
		            else high = mid;
		        }
		        return timestamp >= list.get(high).time ? list.get(high).key : list.get(low).key;
		    }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
