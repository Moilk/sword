public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length < 2 || length < 2 || numbers.length < length) {
            return false;
        }
        
        // 这里虽然有两重循环，但是每个数字最多只要交换了两次就能找到属于它的位置，
        // 所以总的时间复杂度是 O(n)，空间复杂度是 O(1)
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] != numbers[numbers[i]]) {
                    swap(numbers, i, numbers[i]);
                } else {
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }
        
        
        return false;
    }
    
    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}