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
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    Deque<Integer> list = new LinkedList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        helper(root, target);
        
        // 排序
        Collections.sort(ret, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size() - o2.size();
            }
        });
        
        return ret;
    }
    
    private void helper(TreeNode root, int target) {
        if(root == null)    return;
        target -= root.val;
        list.addLast(root.val);
        if(target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<Integer>(list));
        }
        
        if(root.left != null)    helper(root.left, target);
        if(root.right != null)    helper(root.right, target);
        list.removeLast();
    }
}