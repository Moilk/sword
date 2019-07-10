/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        ListNode p = VH;
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                p.next = l2;
                l2 = l2.next;
            } else if(l2 == null) {
                p.next = l1;
                l1 = l1.next;
            } else if(l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        return VH.next;
    }
}