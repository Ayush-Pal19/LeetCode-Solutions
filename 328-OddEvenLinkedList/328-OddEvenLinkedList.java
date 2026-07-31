// Last updated: 7/31/2026, 8:28:37 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);

        ListNode t = head;
        ListNode t1 = odd;
        ListNode t2 = even;
        int idx = 1;
        
        while (t != null) {
            ListNode next = t.next;
            t.next = null;
            if (idx%2 == 0) {
                //Node belongs to even list.
                t2.next = t;
                t2 = t2.next;
            }
            else {
                //Node belongs to odd list.
                t1.next = t;
                t1 = t1.next;
            }
            t = next;
            idx++;
        }
        t1.next = even.next; //adding even list at tail of odd ll.
        return odd.next;
    }
}