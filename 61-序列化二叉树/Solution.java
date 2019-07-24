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
    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        
        
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        Serialize(root.left, sb);
        Serialize(root.right, sb);
        
        return sb.toString();
    }
    
    private void Serialize(TreeNode root, StringBuilder sb) {
        sb.append(',');
        if (root == null) {
            sb.append('#');
            return;
        }
        sb.append(root.val);
        Serialize(root.left, sb);
        Serialize(root.right, sb);
    }
    
    TreeNode Deserialize(String str) {
        if (str == null) {
            return null;
        }
        
        String[] tmp = str.split(",");
        
        return Deserialize(Arrays.asList(str.split(",")).listIterator());
    }
    
    TreeNode Deserialize(ListIterator<String> it) {
        if (!it.hasNext()) {
            return null;
        }
        
        String str = it.next();
        
        if (str.isEmpty() || str.equals("#")) {
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(str));
        root.left = Deserialize(it);
        root.right = Deserialize(it);
        
        return root;
    }
}