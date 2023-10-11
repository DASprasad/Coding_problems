package progarm;
import java.util.*;
public class _916_Word_Subsets {
	
	public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList();
        int[] freq = new int[27];
        
        for(int i = 0 ; i < words2.length ; i++){
            String s = words2[i];
            int[] temp = new int[27];
            
            for(int idx = 0 ; idx < s.length() ; idx++){
                int c = s.charAt(idx) - 'a';
                temp[c]++;
            }
            
            for(int j = 0 ; j < freq.length ; j++){
                freq[j] = Math.max(freq[j] , temp[j]);
            }
        }
        
        for(int i = 0 ; i < words1.length ; i++){
            String s = words1[i];
            int[] temp = new int[27];
            boolean flag = true;
             for(int idx = 0 ; idx < s.length() ; idx++){
                int c = s.charAt(idx) - 'a';
                temp[c]++;
            }
             for(int j = 0 ; j < freq.length ; j++){
                 if(temp[j] < freq[j]) {flag = false; break;}
             }
             if(flag) res.add(s);
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _916_Word_Subsets ob = new  _916_Word_Subsets();
		 String[] words1 = {"amazon","apple","facebook","google","leetcode"};
		 String[] words2 = {"e","o"};
		 
		 System.out.println(ob.wordSubsets(words1, words2));

	}

}
