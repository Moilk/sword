import java.util.*;

/**
 * 时间复杂度为 O(n)，空间复杂度为 O(1)
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int num = 0;
        
        for(int v : array) {
            if (count == 0) {
                count = 1;
                num = v;
            } else if (num == v) {
                count++;
            } else {
                count--;
            }
        }
        
        count = 0;
        for (int v : array) {
            if (v == num) {
                count++;
            }
        }
        
        return count > array.length / 2 ? num : 0;
    }
}