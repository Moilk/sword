import java.util.*;


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
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        
        if (pRoot == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        int curSize = 1, nextSize = 0;
        ArrayList<Integer> curList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            curList.add(node.val);
            
            if (node.left != null) {
                queue.offer(node.left);
                nextSize++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                nextSize++;
            }
            
            if (curList.size() == curSize) {
                ret.add(curList);
                curSize = nextSize;
                nextSize = 0;
                curList = new ArrayList<>();
            }
        }
        
        return ret;
    }
    
}