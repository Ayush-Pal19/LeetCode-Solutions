// Last updated: 7/31/2026, 8:28:30 PM
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        if (!head) return head;
        
        ListNode odd(-1);
        ListNode even(-1);

        ListNode* temp = head;
        ListNode* t1 = &odd;
        ListNode* t2 = &even;
        int idx = 1;

        while (temp != nullptr) {
            ListNode* nextNode = temp->next;
            temp->next = nullptr;

            if (idx % 2 == 0) {
                t2->next = temp;
                t2 = t2->next;
            }
            else {
                t1->next = temp;
                t1 = t1->next;
            }
            temp = nextNode;
            idx++;
        }

        t1->next = even.next;
        return odd.next;
    }
};