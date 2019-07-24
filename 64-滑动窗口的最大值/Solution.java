import java.util.*;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null || num.length == 0 || size == 0) {
            return ret;
        }
        
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        int s = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= maxValue) {
                maxValue = num[i];
                maxIndex = i;
            }
            if ((i - s + 1) == size) {
                ret.add(maxValue);
                if (s == maxIndex) {
                    maxValue = Integer.MIN_VALUE;
                    for (int j = s + 1; j <= i; j++) {
                        if (num[j] >= maxValue) {
                            maxValue = num[j];
                            maxIndex = j;
                        }
                    }
                }
                s++;
            }
        }
        
        return ret;
    }
}