// Last updated: 8/8/2026, 3:26:17 PM
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        if (head == nullptr || head->next == nullptr) return nullptr;
        ListNode* slow = head;
        ListNode* fast = head->next;
        while (fast->next != nullptr && fast->next->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        slow->next = slow->next->next;
        return head;
    }
};