// Last updated: 8/9/2026, 12:54:46 PM
1class Solution {
2public:
3    ListNode* rotateRight(ListNode* head, int k) {
4        if (!head || !head->next || k == 0) return head;
5        
6        int len = 1;
7        ListNode* temp = head;
8        while (temp->next != nullptr) {
9            len++;
10            temp = temp->next;
11        }
12
13        k %= len;
14        if (k == 0) return head;
15        
16        temp->next = head;
17        for (int i = 0; i < len - k; i++) {
18            temp = temp->next;
19        }
20        ListNode* newHead = temp->next;
21        temp->next = nullptr;
22        return newHead;
23    }
24};