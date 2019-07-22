public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.isEmpty())
            return 0;
        
        int ret = 0;
        int i = 0;
        
        // 注意可能有符号位 +/-
        boolean isPostive = true;
        char sign = str.charAt(0);
        if (sign == '+' || sign == '-') {
            isPostive = sign == '+';
            i++;
        }
        
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9' ) {
                ret = ret * 10 + (c - '0');
            } else {
                return 0;
            }
        }
        
        return isPostive ? ret : -ret;
    }
}