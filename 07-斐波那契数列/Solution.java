public class Solution {
    public int Fibonacci(int n) {
        if( n==0 )    return 0;
        if(n == 1)    return 1;
        int pre = 0;
        int ret = 1;
        int tmp;
        for(int i = 2; i <= n; i++) {
            tmp = ret;
            ret += pre;
            pre = tmp;
        }
        
        return ret;
    }
}