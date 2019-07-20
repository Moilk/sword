public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int pos = bFind(array, k, 0, array.length - 1);
        if (pos < 0)    return 0;
        int count = 1;
        int i = pos;
        while((--i) >= 0 && array[i] == k)    count++;
        i = pos;
        while ((++i) < array.length && array[i] == k)    count++;
        
        return count;
    }
    
    // 二分搜索
    private int bFind(int[] array, int k, int s, int e) {
        if (s > e)    return -1;
        int mid = s + (e - s) / 2;
        if (array[mid] > k) {
            return bFind(array, k, s, mid - 1);
        } else if (array[mid] < k) {
            return bFind(array, k, mid + 1, e);
        } else {
            return mid;
        }
    }
}