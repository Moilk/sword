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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        int curSize = 1, nextSize = 0, curLay = 0;
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
                if (curLay % 2 == 1) {
                    Collections.reverse(curList);
                }
                ret.add(curList);
                curList = new ArrayList<>();
                curSize = nextSize;
                nextSize = 0;
                curLay++;
            }
        }
        
        return ret;
    }
}