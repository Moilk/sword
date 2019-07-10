import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        
        int flag = 0;
        for(int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            
            while(!stack.isEmpty() && stack.peek() == popA[flag]) {
                stack.pop();
                flag++;
            }
        }
        
        return flag == popA.length;
    }
}