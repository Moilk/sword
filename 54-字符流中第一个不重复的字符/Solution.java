import java.util.*;

public class Solution {
    class ListNode {
        char val;
        ListNode next;
        ListNode(char c) {
            val = c;
        }
    }
    
    private ListNode head = new ListNode('#');
    private ListNode tail = head;
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (!findThenRemove(ch)) {
            tail.next = new ListNode(ch);
            tail = tail.next;
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if (head.next != null) {
            return head.next.val;
        }
        
        return '#';
    }
    
    private boolean findThenRemove(char c) {
        ListNode p = head;
        
        while (p.next != null) {
            if (p.next.val == c) {
                if (tail == p.next) {
                    tail = p;
                }
                p.next = p.next.next;
                return true;
            }
            p = p.next;
        }
        
        return false;
    }
}