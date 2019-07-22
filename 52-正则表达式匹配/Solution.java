public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null) {
            return false;
        }
        return match(str, 0, pattern, 0);
    }
    
    private boolean match(char[] str, int start, char[] pattern, int offset) {
        // 表达式结束
        if (offset >= pattern.length) {
            return start >= str.length;
        }
        
        // 第一个字母匹配
        boolean firstMatched = false;
        if (start < str.length && (pattern[offset] == '.' || pattern[offset] == str[start])) {
            firstMatched = true;
        }
        
        // 第二次字母是 `*`
        if (offset < pattern.length - 1 && pattern[offset + 1] == '*') {
            if (firstMatched) {
                // 第一个字母匹配成功，* 可以匹配 (0/1/无数) 次
                return match(str, start + 1, pattern, offset)    // * 匹配多次
                    || match(str, start + 1, pattern, offset + 2)// * 匹配 1 次
                    || match(str, start, pattern, offset + 2);   // * 匹配 0 次
            } else {
                // 第一次字母匹配失败，*只能匹配 0 次
                return match(str, start, pattern, offset + 2);
            }
        } else {
            // 第二次字母非 `*`
            return firstMatched && match(str, start + 1, pattern, offset + 1);
        }
    }
}