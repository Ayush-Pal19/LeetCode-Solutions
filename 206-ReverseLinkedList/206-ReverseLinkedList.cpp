// Last updated: 7/31/2026, 8:28:49 PM
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* curr = head;
        ListNode* prev = nullptr;
        ListNode* fwd = nullptr;

        while (curr != nullptr) {
            fwd = curr->next;
            curr->next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
};