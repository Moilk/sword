public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        int start = 0;
        int ret = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0; i < array.length; i++) {
            cur += array[i];
            ret = Math.max(ret, cur);
            if(cur <= 0) {
                start = i + 1;
                cur = 0;
            }
        }
        
        return ret;
    }
}