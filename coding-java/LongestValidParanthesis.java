package progarm;
///////////////////solved/////////////////
public class LongestValidParanthesis {
	
	
public int longestValidParentheses(String s) {
        
        if(s.length()==0 )
        {
            return 0;
        }
        int max=0;
        int counter=0;
        int temp=0;
        
        int[] nums= new int[s.length()];
        for(int i=nums.length-1;i>=0;i--){
            if(counter<0){
                nums[i]=-1;
                counter=0;
                
            }
            if(s.charAt(i)==')'){
                counter=counter+1;
                nums[i]=counter;
            }
            else{
                counter=counter-1;
                nums[i]=counter;
            }
            
        }
         
        counter=0;
        for(int i=0;i<s.length();i++){
            
            if(counter<0){
                counter=0;
                max=Math.max(temp,max);
                temp=0;
                
            }
            if(s.charAt(i)=='('){
                counter=counter+1;
                if(nums[i]!=-1){
                temp=temp+1;
                }
                else{
                    temp=0;
                }
                max=Math.max(temp,max);
            }
               
            if(s.charAt(i)==')'){
                counter=counter-1;
                if(counter>=0){
                temp=temp+1;
                max=Math.max(temp,max);
                }
            }
        }
            
            
        return max;
    }
	public static void main(String[] args) {
    LongestValidParanthesis ob =new LongestValidParanthesis();
		

        
	}

}
