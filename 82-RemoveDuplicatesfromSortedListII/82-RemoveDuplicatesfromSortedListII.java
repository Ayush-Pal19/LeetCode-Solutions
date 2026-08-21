// Last updated: 8/21/2026, 9:18:14 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null || head.next == null) return head;
4        
5        ListNode dummy = new ListNode(-1);
6        dummy.next = head;
7
8        ListNode prev = dummy;
9        ListNode curr = head;
10        ListNode fwd = head.next;
11
12        while (fwd != null) {
13            if (fwd.val != curr.val) {
14                prev = prev.next;
15                curr = curr.next;
16                fwd = fwd.next;
17            }
18            else {
19                while (fwd != null && curr.val == fwd.val) {
20                    fwd = fwd.next;
21                }
22                prev.next = fwd;
23                curr = fwd;
24                if (fwd != null) {
25                    fwd = fwd.next;
26                }
27            }
28        }
29        return dummy.next;
30    }
31}