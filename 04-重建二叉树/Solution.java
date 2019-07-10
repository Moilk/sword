/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return helper(pre, in, 0, 0, pre.length);
    }
    
    private static TreeNode helper(int [] pre, int[] in, int ps, int is, int n) {
        if(n<=0)    return null;
        if((ps + n) > pre.length)    return null;
         if((is + n) > in.length)    return null;
        
        TreeNode root = new TreeNode(pre[ps]);
        
        int leftSize = 0;
        for(; leftSize < n; leftSize++) {
            if(in[leftSize + is] == pre[ps]){
                break;
            }
        }
        root.left = helper(pre, in, ps + 1, is, leftSize);
        root.right = helper(pre, in, ps + 1 + leftSize, is + leftSize + 1, n - 1 - leftSize);
        
        return root;
    }
}