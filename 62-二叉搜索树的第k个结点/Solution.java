/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.*;

public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k == 0) {
            return null;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = pRoot;
        
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.addFirst(p);
                p = p.left;
            } else {
                p = stack.removeFirst();
                k--;
                if (k == 0) {
                    return p;
                }
                p = p.right;
            }
        }
        
        return null;
    }
}