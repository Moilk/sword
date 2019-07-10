public class Solution {
    double[] memo;
    public double Power(double base, int exponent) {
        if(base == 0.0)    return 0.0;
        if(exponent == 0)    return 1.0;
        
        if(exponent >= 0)
            memo = new double[exponent + 1];
        else 
            memo = new double[-exponent + 1];
            
        memo[0] = 1.0;
        memo[1] = base;
        
        if(exponent >= 0){
            return helper(exponent);
        } else {
            return 1/ helper(-exponent);
        }
    }
    
    private double helper(int exp) {
        if(memo[exp] != 0)    return memo[exp];
        int halfA = exp >> 1;
        int halfB = halfA;
        if(exp % 2 == 1)    halfB++;
        memo[exp] = helper(halfA) * helper(halfB);
        return memo[exp];
    }
}