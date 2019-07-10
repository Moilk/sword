/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        helper(listNode, ret);
        
        return ret;
    }
    
    private static void helper(ListNode listNode, ArrayList<Integer> ret) {
        if(listNode == null)    return;
        helper(listNode.next, ret);
        ret.add(listNode.val);
    }
}