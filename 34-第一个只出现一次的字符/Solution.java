public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] count = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)]==1) {
                return i;
            }
        }
        
        return -1;
    }
}