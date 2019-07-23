public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        int N = str.length - 1;
        int posE = -1;
        if ((posE = find(str, 0, N, 'E')) >=0 || (posE = find(str, 0, N, 'e')) >= 0) {
            if (posE >= (str.length - 1)) {
                return false;
            }
            return isFloat(str, 0, posE - 1) && isInt(str, posE + 1, N);
        }
        
        return isFloat(str, 0, N);
    }
    
    // 判断是否为浮点数
    private boolean isFloat(char[] str, int s, int e) {
        if (s > e) {
            return false;
        }
        
        // +/-
        if (e > s && (str[s] == '+' || str[s] == '-')) {
            s++;
        }
        
        
        int pointIndex = -1;
        
        // 查找小数点，展示把小数点替换成一个数字
        if ((pointIndex = find(str, s, e, '.')) >= s) {
            if (pointIndex == e) {
                return false;
            }
            str[pointIndex] = '9';
        }
        
        // 判断是不是整数
        boolean ok = isUnsignedInt(str, s, e);
        
        // 小数点还原
        if (pointIndex >= 0) {
            str[pointIndex] = '.';
        }
        
        return ok;
    }
    
    // 判断是否为整数 （带符号）
    private boolean isInt(char[] str, int s, int e) {
        if (s > e) {
            return false;
        }
        
        if (e > s && (str[s] == '+' || str[s] == '-')) {
            s++;
        }
        
        return isUnsignedInt(str, s, e);
    }
    
    // 判断是不是没有符号位的整数
    private static boolean isUnsignedInt(char[] str, int s, int e) {
        if (s > e) {
            return false;
        }
        while (s <= e) {
            if (str[s] < '0' || str[s] > '9') {
                return false;
            }
            s++;
        }
        return true;
    }
    
    // 寻找字符
    private static int find(char[] str, int s, int e, char c) {
        for (int i = s; i <= e; i++) {
            if (str[i] == c) {
                return i;
            }
        }
        return -1;
    }
}