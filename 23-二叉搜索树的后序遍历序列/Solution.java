public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return isBST(sequence, 0, sequence.length - 1);
    }
    
    private boolean isBST(int[] seq, int s, int e) {
        if(s > e)    return false;
        if((e -s) <= 2)    return true;
        
        int rt = s;
        for(; rt < e; rt++) {
            if(seq[rt] > seq[e]){
                break;
            }
        }
        for(int i = rt; i < e; i++) {
            if(seq[i] < seq[e]){
                return false;
            }
        }
        
        boolean lf = rt > s ? isBST(seq, s, rt - 1) : true;
        boolean rg = rt < e ? isBST(seq, rt, e - 1) : true;
        
        return lf && rg;
    }
}