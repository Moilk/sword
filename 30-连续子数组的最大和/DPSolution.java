/**
 * dp[i] 表示以第 i 个元素结尾的子序列的最大和
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0)    return 0;
        
        int[] dp = new int[array.length + 1];
        dp[0] = array[0];
        int ret = dp[0];
        for (int i = 1; i < array.length; i++) {
            if (dp[i - 1] <= 0) {
                dp[i] = array[i];
            } else {
                dp[i] = dp[i - 1] + array[i];
            }
            ret = Math.max(ret, dp[i]);
        }
        
        return ret;
    }
}