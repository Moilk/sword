import java.util.*;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        return NumberOf1Between1AndN_Solution(String.valueOf(n));
    }
    
    // abcd
    private int NumberOf1Between1AndN_Solution(String abcd) {
        if (abcd == null || abcd.isEmpty())    return 0;
        
        int len = abcd.length();
        // 如果长度为 1，直接返回结果
        if (len == 1) {
            int a = abcd.charAt(0) - '0';
            return a > 0 ? 1 : 0;
        }
        
        // 对于数字 abcd，分成段 [bcf, abcd] 和 [1， bcd]
        
        // 考虑 [bcf, abcd]
        // 首先考虑最高位为 1 的情况，
        // 如果 a 大于 1，则数量为 10 ^ (bcd的长度)，
        // 如果 a 等于 1，则数量为 (bcd + 1),
        String bcd =abcd.substring(1);
        int bcdVal = Integer.parseInt(bcd);
        int highestCount;
        int a = abcd.charAt(0) - '0';
        if (a > 1) {
            highestCount = power10(len - 1);
        } else if (a == 1) {
            highestCount = bcdVal + 1;
        } else {
            highestCount = 0;
        }
        
        // 而其他位置为 1，可以任取其中一位为 1，然后其它几位可以从 [0 - 9] 中任选，
        int leftCount = a * (len - 1) * power10(len - 2);
        
        // 递归计算 [1， bcd]
        return highestCount + leftCount + NumberOf1Between1AndN_Solution(bcd);
    }
    
    private static int power10(int n) {
        int ret = 1;
        for(int i = 0; i < n; i++) {
            ret *= 10;
        }
        
        return ret;
    }
}