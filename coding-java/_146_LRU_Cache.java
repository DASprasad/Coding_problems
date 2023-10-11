package progarm;
import java.util.*;
public class _146_LRU_Cache {
	 int size; cache lru;
	 HashMap<Integer , Integer>map;
	 HashMap<Integer , cache> ref;
	 
	 class cache{
		int  val;
		 cache head; cache tail;  cache next; cache prev;
		cache(){   };
		
		cache(int val){
			this.val = val;
		}
		
		public  void add(int val) {
			cache temp = new cache(val);
			if(head == null) { head = temp; tail = temp; }
			
			else {
				tail.next = temp;
				temp.prev = tail;
				tail = tail.next;
			}

		}
		public  void remove(cache node) {
			if(node == head) { head = head.next;}
			else if(node == tail) { tail = tail.prev; tail.next = null;} 
			else { node.prev.next = node.next;}
		}
	}
		
		 public _146_LRU_Cache(int capacity) {
		        this.size = capacity;
		        map = new HashMap(); ref = new HashMap();
		        lru = new cache();
		    }
		    
		    public int get(int key) {
		    	
		        if(map.containsKey(key)) {
		        cache node = ref.get(key);
		        lru.remove(node);
		        lru.add(key);
		        return map.get(key);
		        }
		        else return -1;
		    }
		    
		    public void put(int key, int value) {
		    	
		    	
		    	
		        if(map.containsKey(key)) {
		        	cache node = ref.get(key);
		        	lru.remove(node);
		        	lru.add(key);
		        	ref.put(key, lru.tail);
			        map.put(key, value);
		        }
		        else {
		        	if(size == 0) {
		        		map.remove(lru.head.val);
		        		ref.remove(lru.head.val);
		        		lru.remove(lru.head);
		        		System.out.println(lru.head.val);
		        		
		        		size++;
		        	}
		        	map.put(key, value);
		        	lru.add(key);
		        	ref.put(key , lru.tail);
		        	size --;
		        	
		        }
		        
		    }
		    public void display() {
		    	cache head = lru.head;
		    	while(head != null) {
		    		System.out.print(head.val + "--> ");
		    		head = head.next;
		    	}
		    	System.out.println();
		    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_146_LRU_Cache ob = new _146_LRU_Cache(2);
		ob.put(2, 1);
		ob.display();
		ob.put(1, 1);
		ob.display();
		System.out.println(ob.get(2));
		ob.display();
		ob.put(4, 1);
		ob.display();
		System.out.println(ob.get(1));
		ob.display();
		System.out.println(ob.get(2));
		ob.display();
//		System.out.println(ob.get(4));
//		ob.display();
//		System.out.println(ob.get(1));
//		ob.display();
//		ob.put(4, 4);
//		ob.display();
//		System.out.println(ob.get(2));
//		ob.display();
//		ob.put(3, 2);
//		ob.display();
//		ob.get(4);
//		ob.display();

	}

}
