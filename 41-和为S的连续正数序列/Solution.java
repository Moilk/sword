import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int stop = (sum + 1) /2;
        int s = 1, e = 1;
        int adder = 1;
        while (e <= stop) {
            if (adder < sum) {
                e++;
                adder += e;
            } else if (adder > sum) {
                adder -= s;
                s++;
            } else {
                if (e > s)
                    ret.add(getSeq(s, e));
                e++;
                adder += e;
            }
        }
        
        return ret;
    }
    
    private ArrayList<Integer> getSeq(int s, int e) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (; s <= e; s++) {
            ret.add(s);
        }
        return ret;
    }
}