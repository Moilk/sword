import java.util.*;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        
        Arrays.sort(numbers);
        int zeroCount = 0;
        int detaCount = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
                continue;
            }
            int diff = numbers[i + 1] - numbers[i];
            if (diff <= 0) {
                return false;
            } else if (diff >= 2) {
                detaCount += diff - 1;
            }
        }
        
        return zeroCount >= detaCount;
    }
}