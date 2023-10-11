package progarm;
import java.util.*;
public class wordBreak {
boolean flag=false;
static int global=0;
        
        
    
    public void check(String str,int i,HashSet<String>h,int dp[]){
        global=global+1;
        if(flag==true){
            return;
        }
        if(i>=str.length()){
            flag=true;
            System.exit(0);
        }
        if(dp[i]==0) {
        	return;
        }
        
        for(int k=i;k<str.length();k++){
            if(h.contains(str.substring(i,k+1))){
                check(str,k+1,h,dp);
            }
        }
        dp[i]=0;
    }
    public boolean wordBreak1(String s, List<String> wordDict) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp, -2);
        
        HashSet<String>h=new HashSet<String>();
        for(int i=0;i<wordDict.size();i++){
            h.add(wordDict.get(i));
        }
        
        check(s,0,h,dp);
        
        
        return flag;
    }

	public static void main(String[] args) {
		wordBreak ob =new wordBreak();
		ArrayList<String>wordDict=new ArrayList<String>();
		wordDict.add("a");
		wordDict.add("aa");
		wordDict.add("aaa");
		wordDict.add("aaaa");
		wordDict.add("aaaaa");
		wordDict.add("aaaaaa");
		wordDict.add("aaaaaaa");
		wordDict.add("aaaaaaaa");
        String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        System.out.println(ob.wordBreak1(s,wordDict));
        System.out.println(global);

	}

}
