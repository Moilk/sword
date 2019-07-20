//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        int x = 1;
        while ((xor & x) == 0) {
            x <<= 1;
        }
        
        num1[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & x) != 0) {
                num1[0] ^= array[i];
            }
        }
        num2[0] = num1[0] ^ xor;
    }
}