import java.util.*;
class _2251_Number_of_Flowers_in_Full_Bloom {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int[] result = new int[persons.length];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for (int[] flower : flowers) {
            treeMap.put(flower[0], treeMap.getOrDefault(flower[0], 0 ) + 1);
            treeMap.put(flower[1] + 1, treeMap.getOrDefault(flower[1] + 1, 0) - 1);
        } 
                
        int currentValue = 0;        
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            currentValue = currentValue + entry.getValue();
            entry.setValue(currentValue);
        }
        
        for (int i = 0; i  < persons.length; i++) {
            int person = persons[i];
            Map.Entry<Integer, Integer> entry = treeMap.floorEntry(person);
            
            if (entry != null) {
                result[i] = result[i] + entry.getValue();
            }
        }
        
        return result;
    }
}