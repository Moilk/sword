import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> ret = new ArrayList<>(2);
        if (array == null || array.length < 2)    return ret;
        int s = 0, e = array.length - 1;
        long product = Long.MAX_VALUE;
        while (s < e) {
            int tmp = array[s] + array[e];
            if (tmp > sum) {
                e--;
            } else if (tmp < sum) {
                s++;
            } else {
                int p = array[s] * array[e];
                if (p < product) {
                    ret.clear();
                    ret.add(array[s]);
                    ret.add(array[e]);
                    product = p;
                }
                s++;
                e--;
            }
        }
        
        return ret;
    }
} 