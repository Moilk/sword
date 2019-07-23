/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null) {
            return null;
        }
        
        ListNode fast = pHead, slow = pHead;
        boolean hasCircle = false;
        while (fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCircle = true;
                break;
            }
        }
        if (!hasCircle) {
            return null;
        }
        
        fast = pHead;
        while (fast != null && slow != null) {
            if (fast == slow) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        
        return null;
    }
}