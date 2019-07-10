public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0)    return 1;
        
        int ret = 1;
        for(int i = 0; i < target -1; i++) {
            ret *= 2;
        }
        
        return ret;
    }
}