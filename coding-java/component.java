package progarm;
import java.util.ArrayList;
import java.util.Arrays;

public class component {
	
	int val;
	ArrayList<component> list;
	Integer[][] arr ;
	component head;
	
	
	public component() {
		
	}
	
	public component(Integer[][] arr) {
	     this.arr = arr;
	}
	
	public void  createTree() {
		
		if(head == null) {
			head = new component();
			head.val = this.arr[0][0];
		}
		int row = 1;
		int lev = 0;
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[][] arr = {{10},{1,2,3},{4,5},{6,7,8},{null,2,3},{4,3,7},null};

	}

}
