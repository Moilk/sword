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
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        // 虚拟头结点
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = pHead;
        ListNode pre = VH;
        ListNode p = pHead;
        
        while (p != null) {
            if (p.val != pre.next.val) {
                if (pre.next.next != p) {
                    pre.next = p;
                } else {
                    pre = pre.next;
                }
            }
            p = p.next;
        }
        
        if (pre.next.next != null) {
            pre.next = null;
        }
        
        return VH.next;
    }
}