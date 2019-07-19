import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (input == null || input.length < k || k == 0) {
            return ret;
        }
        
        int start = 0, end = input.length - 1;
        int mid = Integer.MIN_VALUE;
        while (mid != k - 1) {
            mid = partition(input, start, end);
            if (mid > k - 1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        for(int i = 0; i < k; i++) {
            ret.add(input[i]);
        }
        
        return ret;
    }
    
    private int partition(int[] array, int start, int end) {
        swap(array, start, random(start, end));
        int v = array[start];
        int i = start, j = end + 1;
        
        while (true) {
            while (array[++i] <= v) if (i == end) break;
            while (array[--j] >= v) if (j == start) break;
            if(i >= j)    break;
            swap(array, i, j);
        }
        swap(array, start, j);
        
        return j;
    }
    
    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    
    private int random(int s, int e) {
        return new Random().nextInt(e - s + 1) + s;
    }
}