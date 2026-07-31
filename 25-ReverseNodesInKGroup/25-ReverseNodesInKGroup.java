// Last updated: 7/31/2026, 8:29:02 PM
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode forward = null;

        while (current != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k==1) return head;
        ListNode count = head;
        int len = 0;
        while (count!=null) {
            count = count.next;
            len++;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode head1 = head;

        for (int i = 0; i < (len/k); i++) {
            ListNode tail = head1;
            for (int j = 0; j < k-1; j++) {
                tail = tail.next;
            }
            ListNode head2 = tail.next;
            tail.next = null;
            tail = reverse(head1);
            temp.next = tail;
            temp = head1;
            head1 = head2;
        }
        temp.next = head1;
        return dummy.next;
    }
}