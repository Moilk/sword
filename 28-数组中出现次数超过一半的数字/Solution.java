import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int newCount = 0;
        for (int i : array) {
            if(map.containsKey(i)) {
                newCount = map.get(i) + 1;
                if (newCount > (array.length / 2)) {
                    return i;
                }
                map.put(i, map.get(i) + 1);
            } else {
                newCount = 1;
                map.put(i, 1);
            }
            if (newCount > array.length / 2) {
                return i;
            }
        }
        
        return 0;
    }
}