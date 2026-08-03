// Last updated: 8/3/2026, 6:47:50 PM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        ListNode temp1 = headA;
4        ListNode temp2 = headB;
5        int len1 = 0;
6        int len2 = 0;
7
8        while (temp1 != null) {
9            temp1 = temp1.next;
10            len1++;
11        }
12        while (temp2 != null) {
13            temp2 = temp2.next;
14            len2++;
15        }
16
17        temp1 = headA;
18        temp2 = headB;
19
20        if (len1 > len2) {
21            for (int i = 0; i < len1 - len2; i++) {
22                temp1 = temp1.next;
23            }
24        }
25        else {
26            for (int i = 0; i < len2 - len1; i++) {
27                temp2 = temp2.next;
28            }
29        }
30
31        while (temp1 != temp2) {
32            temp1 = temp1.next;
33            temp2 = temp2.next;
34        }
35
36        return temp1;
37    }
38}