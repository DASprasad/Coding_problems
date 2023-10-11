package progarm;
import java.util.*;
    public class _23_Merge_k_Sorted_Lists {
    	
    	public class ListNode {
    	      int val;
    	     ListNode next;
    	     ListNode() {}
    	     ListNode(int val) { this.val = val; }
    	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }   
    	 }
    	
    	 public ListNode createList(int[] arr) {
   	   	  ListNode head = new ListNode(arr[0]);
   	   	  ListNode p = head;
   	   	  for(int i=1;i<arr.length;i++) {
   	   		  ListNode n = new ListNode(arr[i]);
   	   		  p.next = n;
   	   		  p = p.next;
   	   	  }
   	   	  return head;
   	     }
    	 
    	 
    	 
    	 public ListNode mergeKLists(ListNode[] lists) {
    		 PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
    	            @Override
    	            public int compare(ListNode o1,ListNode o2){
    	                if (o1.val<o2.val)
    	                    return -1;
    	                else if (o1.val==o2.val)
    	                    return 0;
    	                else 
    	                    return 1;
    	            }
    	        });
    		 
    		 for(int i=0;i<lists.length;i++) if(lists[i]!=null) heap.add(lists[i]);
    		 
    		 
    		   ListNode head = new ListNode(0);
    	       ListNode help=head;
    		 
    		 while(heap.size()>0) {
    			 ListNode temp = heap.poll();
    			 help.next = temp;
    			 help = help.next;
    			 temp = temp.next;
    			 if(temp != null) heap.add(temp);
    		 }
    		 display(head.next);
    		 return head;
    				 
    	 }
    	 
    	 
    	 public void display(ListNode head) {
    		 while(head!=null) {
    			 System.out.print(head.val+"--> ");
    			 head = head.next;
    		 }
    	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_23_Merge_k_Sorted_Lists ob = new _23_Merge_k_Sorted_Lists();
		int[] a = {1,3,7,12};
		int[] b = {3,6,17,23};
		int[] c = {5,7,12,79};
		int[] d = {0,1,2,3,4};
		ListNode[] list = new ListNode[4];
		ListNode  h1 = ob.createList(a);
		ListNode  h2 = ob.createList(b);
		ListNode  h3 = ob.createList(c);
		ListNode  h4 = ob.createList(d);
		list[0] =h1 ; list[1] = h2; list[2] = h3 ; list[3] = h4;  
		
		ob.mergeKLists(list);
		
	}

}
