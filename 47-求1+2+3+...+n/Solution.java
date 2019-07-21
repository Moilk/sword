public class Solution {
    public int Sum_Solution(int n) {
        int ret = 0;
        boolean tmp = n > 0 && (ret = Sum_Solution(n - 1)) > 0;
        return ret + n;
    }
}