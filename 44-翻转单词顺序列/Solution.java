public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        
        char[] array = str.toCharArray();
        reverse(array, 0, array.length - 1);
        int start = 0;
        int end = 0;
        while (end < array.length) {
            if (array[end] == ' ') {
                reverse(array, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverse(array, start, end - 1);
        
        return new String(array);
    }
    
    private void reverse(char[] array, int i, int j) {
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(char[] array, int i, int j) {
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}