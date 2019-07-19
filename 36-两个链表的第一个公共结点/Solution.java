/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2 = pHead2;
        int count1 = 0, count2 = 0;
        
        while (p1 != null) {
            count1++;
            p1 = p1.next;
        }
        
        while (p2 != null) {
            count2++;
            p2 = p2.next;
        }
        
        p1 = pHead1;
        p2 = pHead2;
        int dis = count1 - count2;
        // 交换
        if (count2 > count1) {
            dis = count2 - count1;
            ListNode tmp = p1;
            p1 = p2;
            p2 = tmp;
        }
        
        while (dis > 0) {
            p1 = p1.next;
            dis--;
        }
        
        while (p1 != null && p2 != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        if (p1 == null || p2 == null) return null;
        return p1;
    }
}