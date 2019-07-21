public class Solution {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() < 2)    return str;
        
        int m = str.length();
        int start = n % m;
        return str.substring(start, m) + str.substring(0, start);
    }
}