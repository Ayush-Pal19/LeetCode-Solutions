// Last updated: 7/31/2026, 8:29:22 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        
        ListNode temp = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;
        
        while (t1 != null || t2 != null || carry > 0) {
            int sum = ((t1!=null) ? t1.val : 0) + ((t2!=null) ? t2.val : 0) + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            
            temp = temp.next;
            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }

        return dummy.next;
    }
}