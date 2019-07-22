import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if (A == null)    return null;
        
        int n = A.length;
        int[] B = new int[n];
        
        // 先计算右边 B[i] = A[i + 1] * A[i + 2] + ... + A[n - 1]
        B[n - 1] = 1;
        for (int i = n - 1; i > 0; i--) {
            B[i - 1] = B[i] * A[i];
        }
        
        // 再乘上左边
        int left = 1;
        for (int i = 1; i < n; i++) {
            left *= A[i - 1];
            B[i] *= left;
        }
        
        return B;
    }
}