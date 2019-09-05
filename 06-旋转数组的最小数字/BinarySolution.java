class Solution {
    public int minNumberInRotateArray(int[] array) {
        int s = 0;
        int e = array.length - 1;
        while (array[s] >= array[e] && e - s > 1) {
            int mid = s + (e - s) / 2;
            if (array[mid] >= array[s]) {
                s = mid;
            } else {
                e = mid;
            }
        }
        return array[e];
    }
}