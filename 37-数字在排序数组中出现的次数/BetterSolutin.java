public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        int s = bFind(array, k - 0.5);
        int e = bFind(array, k + 0.5);
        
        return e - s;
    }
    
    private int bFind(int[] array, double k) {
        int s = 0, e = array.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array[mid] > k) {
                e = mid - 1;
            } else if (array[mid] < k) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return s;
    }
}