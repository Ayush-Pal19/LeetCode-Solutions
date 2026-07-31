// Last updated: 7/31/2026, 8:28:28 PM
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        ListNode t1 = head;
        ListNode t2 = head2;

        while (t2 != null) {
            if (t1.val!=t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}