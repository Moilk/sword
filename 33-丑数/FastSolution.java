public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index ==0)    return 0;
        int[] dp = new int[index + 1];
        dp[1] = 1;
        int start1 = 1, start2 = 1, start3 = 1;
        for(int k = 2; k <= index; k++) {
            dp[k] = Integer.MAX_VALUE;
            while (dp[start1] * 2 <= dp[k - 1])    ++start1;
            while (dp[start2] * 3 <= dp[k - 1])    ++start2;
            while (dp[start3] * 5 <= dp[k - 1])    ++ start3;
            dp[k] = Math.min(dp[k], Math.min(dp[start1] * 2, Math.min(dp[start2] * 3, dp[start3] * 5)));
        }
        
        return dp[index];
    }
}