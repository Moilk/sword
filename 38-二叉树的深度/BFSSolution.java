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
import java.util.*;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        // count 为当前层已访问的节点数，laySum 为当前层节点的总数
        // 当 count 等于 laySum 时，说明当前层已经访问完毕，队列里边剩下的就是下一层的节点
        int count = 0, laySum = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            count++;
            if (node.left != null)    queue.offer(node.left);
            if (node.right != null)    queue.offer(node.right);
            if (count == laySum) {
                laySum = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}