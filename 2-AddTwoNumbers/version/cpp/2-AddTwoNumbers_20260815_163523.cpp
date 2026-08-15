// Last updated: 8/15/2026, 4:35:23 PM
1class Solution {
2public:
3    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
4        ListNode* temp1 = l1;
5        ListNode* temp2 = l2;
6        ListNode dummy(-1);
7        ListNode* temp = &dummy;
8        int carry = 0;
9
10        while (temp1 || temp2 || carry > 0) {
11            int sum = (temp1 ? temp1->val : 0) + (temp2 ? temp2->val : 0) + carry;
12            carry = sum / 10;
13            sum %= 10;
14
15            temp->next = new ListNode(sum);
16            temp = temp->next;
17
18            if (temp1) temp1 = temp1->next;
19            if (temp2) temp2 = temp2->next;
20        }
21        
22        return dummy.next;
23    }
24};