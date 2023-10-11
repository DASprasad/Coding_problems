package progarm;

public class _318_Maximum_Product_of_Word_Lengths {
	
	public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        int idx = 0  , res = 0;
        
        for(String s : words){
            int m = 0;
            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i);
                m |= 1 << (c - 'a');
            }
            mask[idx ++] = m;
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if((mask[i] & mask[j]) == 0){
                   res = Math.max(res , words[i].length() * words[j].length()); 
                }
            }
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
