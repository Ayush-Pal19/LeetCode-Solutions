// Last updated: 8/1/2026, 3:40:07 PM
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode current = head;
4        ListNode previous = null;
5        ListNode forward = null;
6
7        while (current != null) {
8            forward = current.next;
9            current.next = previous;
10            previous = current;
11            current = forward;
12        }
13
14        return previous;
15    }
16}