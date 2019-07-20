// 每个节点遍历了多次
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        // 空树是二叉平衡树
        if (root == null)    return true;
        // 左右子树深度之差的绝对值不超过 1
        int depthDiff = getDepth(root.left) - getDepth(root.right);
        if (depthDiff < -1 || depthDiff > 1)    return false;
        // 左右子树也都是平衡二叉树
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    
    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}