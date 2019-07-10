public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null || array.length == 0 || array[0].length == 0)
            return false;
        
        int m = array.length - 1;
        int n = array[0].length - 1;
        
        int x = 0, y = m;
        while(x <= n && y >= 0) {
            if(array[y][x] > target) {
                y--;
            } else if(array[y][x] < target) {
                x++;
            } else {
                return true;
            }
        }
        
        return false;
    }
}