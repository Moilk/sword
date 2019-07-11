/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)    return null;
        
        RandomListNode p = pHead;
        while(p != null) {
            RandomListNode tmp = p.next;
            p.next = new RandomListNode(p.label);
            p.next.next = tmp;
            p = tmp;
        }
        
        p = pHead;
        while(p != null) {
            if(p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        
        RandomListNode ret = pHead.next;
        p = pHead;
        RandomListNode pp = ret;
        while(p != null) {
            p.next = pp.next;
            if(p.next != null)    pp.next = p.next.next;
            p = p.next;
            pp = pp.next;
        }
        
        return ret;
    }
}