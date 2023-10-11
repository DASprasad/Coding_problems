package progarm;
import java.util.*;
public class _763_Partition_Labels {
	 public List<Integer> partitionLabels(String s) {
		 List<Integer> ans=new ArrayList();
		 int[] pos=new int[27];
		 for(int i=s.length()-1;i>=0;i--) {
			 if(pos[s.charAt(i)-'a']==0) {
				 pos[s.charAt(i)-'a']=i;
			 }
		 }
		 int startingIndex=-1;
		 int currentPartition=pos[s.charAt(0)-'a'];
		 for(int i=0;i<s.length();i++) {
			 
			 currentPartition=Math.max(currentPartition,pos[s.charAt(i)-'a']);
			 if(i==currentPartition) {
				 ans.add(i-startingIndex);
				 startingIndex=i;
			 }
		 }
		 System.out.println(ans);
		 return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_763_Partition_Labels ob =new _763_Partition_Labels();
		String s="asjfdghjfgaiudgwauidakjwdbkajdbwakjbcauughwduwabdjabwdjlacbsoiawhdlwadnlkwabowiadhaiwlhd";
		ob.partitionLabels(s);
	

		
	}

}
