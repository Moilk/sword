import java.util.*;

public class Solution {
    private String ret;
    
    public String PrintMinNumber(int [] numbers) {
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        
        ret = combine(strs);
        minNumber(strs, 0);
        
        return ret;
    }
    
    // 全排列
    private void minNumber(String[] strs, int start) {
        if (start == strs.length) {
            String cb = combine(strs);
            if(ret.compareTo(cb) > 0) {
                ret = cb;
            }
            return;
        }
        for (int i = start; i < strs.length; i++) {
            swap(strs, start, i);
            minNumber(strs, start + 1);
            swap(strs, start, i);
        }
    }
    
    private static void swap(String[] a, int i, int j) {
        String tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    private static String combine(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}