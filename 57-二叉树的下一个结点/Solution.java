/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) {
            return null;
        }
        
        // 如果没有右子树，往父节点找
        // 当当前节点为父节点的左节点时，才可返回父节点
        TreeLinkNode p;
        if (pNode.right == null) {
            p = pNode;
            while (p.next != null) {
                if (p == p.next.left) {
                    return p.next;
                }
                p = p.next;
            }
            return null;
        }
        
        // 如果有右子树，找到右字数最左边的节点
        p = pNode.right;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }
}