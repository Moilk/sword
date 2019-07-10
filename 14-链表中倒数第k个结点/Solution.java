/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }
        
        if(k != 0)    return null;
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}