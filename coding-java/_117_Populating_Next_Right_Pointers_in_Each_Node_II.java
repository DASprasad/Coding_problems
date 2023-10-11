package progarm;
import java.util.*;
public class _117_Populating_Next_Right_Pointers_in_Each_Node_II {
	
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	}
	
	
	class Solution {   //solution here
	    public Node connect(Node root) {
	        if(root == null) return null;   // base case
	        Queue<Node> level = new LinkedList();
	        level.add(root); level.add(null);
	        
	        while(level.size() > 1){
	                Node n = level.poll();
	                if(n == null) {   /// to mark end of each level
	                    level.add(null); 
	                    continue;
	                }
	                n.next = level.peek();
	                if(n.left != null) level.add(n.left);
	                if(n.right != null) level.add(n.right);
	        }
	        
	        return root;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
