// 每个节点遍历一遍
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getBalancedDepth(root) >= 0;
    }
    
    // 返回值是非负数，说明是二叉平衡树，且返回数为树的高度
    // 返回数负数，则不是二叉平衡树
    private int getBalancedDepth(TreeNode root) {
        // 空树是平衡二叉树，所以直接返回深度 0
        if (root == null)    return 0;

        // 如果左子树返回的是负数，说明不是二叉平衡树，直接返回 -1
        int lDepth = getBalancedDepth(root.left);
        if (lDepth < 0)    return -1;

        // 如果右子树返回的是负数，说明不是二叉平衡树，直接返回 -1
        int rDepth = getBalancedDepth(root.right);
        if (rDepth < 0)    return -1;

        // 高度之差不小于 1，不是二叉平衡树，返回 -1
        int diff = lDepth - rDepth;
        if (diff > 1 || diff < -1)    return -1;

        // 满足条件，返回子树的高度
        return 1 + Math.max(lDepth, rDepth);
    }
}