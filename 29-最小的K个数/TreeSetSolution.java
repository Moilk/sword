import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(input == null || input.length < k || k == 0) {
            return ret;
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        for (int v : input) {
            set.add(v);
            if(set.size() > k) {
                set.pollLast();
            }
        }
        
        while (!set.isEmpty()) {
            ret.add(set.pollFirst());
        }
        
        return ret;
    }
}