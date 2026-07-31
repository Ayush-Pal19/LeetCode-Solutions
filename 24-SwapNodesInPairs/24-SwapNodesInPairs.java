// Last updated: 7/31/2026, 8:29:05 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode fwd = curr.next;
        while (curr != null && fwd != null) {
            ListNode a = fwd.next;
            prev.next = fwd;
            fwd.next = curr;
            curr.next = a;
            prev = curr;
            curr = a;
            if (curr != null) fwd = curr.next;
        }
        return dummy.next;

    }
}