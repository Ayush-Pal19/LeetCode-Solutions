# Last updated: 7/31/2026, 8:27:50 PM
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        slow = fast = head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        head2 = slow.next
        slow.next = None
        head2 = self.reverse(head2)

        temp1 = head
        temp2 = head2
        maxans = float('-inf')
        while (temp1 and temp2) :
            maxans = max(maxans, temp1.val + temp2.val)
            temp1 = temp1.next
            temp2 = temp2.next
        return maxans

    def reverse(self, head: Optional[ListNode]) -> ListNode:
        curr = head
        prev = None
        while curr:
            fwd = curr.next
            curr.next = prev
            prev = curr
            curr = fwd
        return prev
        