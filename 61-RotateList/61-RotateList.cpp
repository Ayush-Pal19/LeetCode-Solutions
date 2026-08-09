// Last updated: 8/9/2026, 1:06:02 PM
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head || !head->next || k == 0) return head;
        
        int len = 1;
        ListNode* temp = head;
        while (temp->next != nullptr) {
            len++;
            temp = temp->next;
        }

        k %= len;
        if (k == 0) return head;
        
        temp->next = head;
        for (int i = 0; i < len - k; i++) {
            temp = temp->next;
        }
        ListNode* newHead = temp->next;
        temp->next = nullptr;
        return newHead;
    }
};