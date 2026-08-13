// Last updated: 8/13/2026, 9:04:52 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if (head == null || head.next == null || left == right) return head;
4        
5        int len = 0; // Represents the position of curr in the list, with dummy node at zero.
6        //Code is using 1-based position numbering logic only, the zero represents the dummy node. The dummy node is necessary to preserve the intended head of the list, since it might be modified if the value of the integer left is 1.
7        ListNode dummy = new ListNode(-1, head);
8        ListNode curr = dummy;
9
10        while (len < right) {
11            //First we traverse till the node at (left - 1) position. After it we reverse the list, from position left to right. Then we connect the tail of first part to new head of reversed window, and connect the tail of reversed window to starting of the third part.
12
13            //In the first part, integer len represents the position of the node curr in 1-based position numbering. During reversal, it also indicates which node is undergoing reversal, allowing us to stop the loop after the node at position right has been reversed.
14
15            if (len == left - 1) {
16                ListNode before_left = curr; // Last node before the reversal window.
17                ListNode og_left = curr.next; // Starting node of the reversal window.
18                
19                curr = og_left;
20                len++;
21
22                ListNode prev = null;
23                
24                while (len <= right) { // Reversing the list in window, from position left to position right.
25                    ListNode fwd = curr.next;
26                    curr.next = prev;
27                    prev = curr;
28                    curr = fwd;
29                    
30                    len++;
31                }
32                before_left.next = prev; // Connect the end of the first part to the new head of the reversed window.
33                og_left.next = curr; // og_left is now the tail of the reversed window; connect it to the third part of the list.
34                
35                return dummy.next;
36            }
37
38            len++;
39            curr = curr.next;
40        }
41        return dummy.next;
42    }
43}