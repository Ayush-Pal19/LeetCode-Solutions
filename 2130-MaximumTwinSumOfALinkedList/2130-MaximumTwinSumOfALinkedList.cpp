// Last updated: 7/31/2026, 8:27:56 PM
class Solution {
public:
    ListNode* reverse(ListNode* head) {
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
    int pairSum(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast->next != nullptr && fast->next->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode* head2 = slow->next;
        slow->next = nullptr;
        head2 = reverse(head2);
        
        ListNode* temp1 = head;
        ListNode* temp2 = head2;
        int maxSum = std::numeric_limits<int>::min();;

        while (temp1 != nullptr && temp2 != nullptr) {
            maxSum = std::max(maxSum, temp1->val + temp2->val);
            temp1 = temp1->next;
            temp2 = temp2->next;
        }
        return maxSum;
    }
};