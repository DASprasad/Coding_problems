package progarm;
import java.util.*;
public class _692_Top_K_Frequent_Words {
	
	public int compare(Map.Entry<String, Integer>e1 ,Map.Entry<String, Integer> e2) {
		String word1 = e1.getKey();
        int freq1 = e1.getValue();
        String word2 = e2.getKey();
        int freq2 = e2.getValue();
        if(freq1!=freq2){
            return freq2-freq1;
        }
        else {
            return word1.compareTo(word2);
        }
}

   public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((e1,e2)->compare(e1,e2));
        for(Map.Entry<String, Integer> e : map.entrySet()){
            pq.offer(e);
        }
        List<String> ans = new LinkedList<>();
        for(int i = 0;i<=k-1;i++){
            ans.add(pq.poll().getKey());
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
