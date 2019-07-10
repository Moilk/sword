public class Solution {
    public void reOrderArray(int [] array) {
        int lastOdd = 0;
        
        for(int i = 0 ; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                for(int j = i; j > lastOdd; j--){
                    swap(array, j, j - 1);
                }
                lastOdd++;
            }
        }
    }
    
    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}