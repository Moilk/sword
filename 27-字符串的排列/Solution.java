import java.util.*;

public class Solution {
    private ArrayList<String> ret;
    
    public ArrayList<String> Permutation(String str) {
        ret = new ArrayList<>();
        if(str == null || str.isEmpty()) {
            return ret;
        }
        
        char[] array = str.toCharArray();
        Arrays.sort(array);
        
        permutation(array, 0);
        Collections.sort(ret);
        
        return ret;
    }
    
    public void permutation(char[] str, int start) {
        if (start == str.length - 1){
            ret.add(new String(str));
            return;
        }
        
        for(int i = start; i < str.length; i++) {
            // 排除相同元素重复计算的问题
            if (i != start && str[i] == str[start]) {
                continue;
            }
            // 交换是很关键的操作
            swap(str, start, i);
            permutation(str, start + 1);
            swap(str, start, i);
        }
    }
    
    private void swap(char[] array, int a, int b) {
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}