import java.util.*;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode VH = new TreeNode(Integer.MIN_VALUE);
        TreeNode last = VH;
        TreeNode p = pRootOfTree;
        Deque<TreeNode> stack = new LinkedList<>();
        
        while( p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.addFirst(p);
                p = p.left;
            } else {
                p = stack.removeFirst();
                last.right = p;
                p.left = last;
                last = p;
                p = p.right;
            }
        }
        
        if(VH.right != null)
            VH.right.left = null;
        
        return VH.right;
    }
}