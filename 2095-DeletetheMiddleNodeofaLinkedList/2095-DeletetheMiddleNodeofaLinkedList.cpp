// Last updated: 8/8/2026, 3:22:01 PM
1class Solution {
2public:
3    ListNode* deleteMiddle(ListNode* head) {
4        if (head == nullptr || head->next == nullptr) return nullptr;
5        ListNode* slow = head;
6        ListNode* fast = head->next;
7        while (fast->next != nullptr && fast->next->next != nullptr) {
8            slow = slow->next;
9            fast = fast->next->next;
10        }
11        slow->next = slow->next->next;
12        return head;
13    }
14};