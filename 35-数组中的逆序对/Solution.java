public class Solution {
    public int InversePairs(int [] array) {
        return sort(array, array.clone(), 0, array.length - 1) % 1000000007;
    }
    
    private int sort(int[] a, int [] aux, int lo, int hi) {
        if (lo >= hi) return 0;
        
        int mid = lo + (hi - lo) / 2;
        int count1 = sort(aux, a, lo, mid) % 1000000007;
        int count2 = sort(aux, a, mid + 1, hi) % 1000000007;
        int count3 = merge(a, aux, lo, mid, hi) % 1000000007;
        return count1 + count2 + count3;
    }
    
    private int merge(int[] a, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        int ret = 0;
        int rgCount = 0;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
                rgCount++;
            } else if (j > hi) {
                a[k] = aux[i++];
                ret += rgCount;
                if (ret > 1000000007) {
                    ret %= 1000000007;
                }
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i++];
                ret += rgCount;
                if (ret > 1000000007) {
                    ret %= 1000000007;
                }
            } else {
                a[k] = aux[j++];
                rgCount++;
            }
        }
        
        return ret;
    }
}