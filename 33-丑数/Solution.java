public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index ==0)    return 0;
        int[] dp = new int[index + 1];
        dp[1] = 1;
        for(int k = 2; k <= index; k++) {
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < k; i++) {
                int a2 = dp[i] * 2;
                if (a2 >= min)    break;
                if (a2 > dp[k - 1]) {
                    min = a2;
                    continue;
                }
                
                int a3 = dp[i] * 3;
                if (a3 > dp[k - 1] && a3 < min) {
                    min = a3;
                    continue;
                }
                
                int a5 = dp[i] * 5;
                if (a5 > dp[k - 1] && a5 < min) {
                    min = a5;
                    continue;
                }
            }
            dp[k] = min;
        }
        
        return dp[index];
    }
}