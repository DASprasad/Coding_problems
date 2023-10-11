package progarm;
import java.util.*;

public class StockSpanner {
	    
	   
	Stack<Integer>stack=new Stack();
	    ArrayList<Integer>list=new ArrayList();
	    int counter=0;
	    // stack.push(counter);

	    public StockSpanner() {
	        this.stack.push(0);
	        this.list.add(Integer.MAX_VALUE);
	    }
	    
	    public int next(int price) {
	        counter+=1;
	        list.add(price);
	        while(stack.size()>0 && price>=list.get(stack.peek())){
	            stack.pop();
	        }
	        int temp=stack.peek();
	        stack.push(counter);
	        
//	        if(counter-temp<0) {
//	        	System.out.println(1);
//	        	return 1;
//	        }
	        System.out.print(counter-temp+" ");
	        return counter-temp;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockSpanner ob=new StockSpanner();
		 
		
		ob.next(10); 
		ob.next(80); 
		ob.next(60); 
		ob.next(70); 
		ob.next(60); 
		ob.next(75);
		ob.next(85);
		

	}

}
