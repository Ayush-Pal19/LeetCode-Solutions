# Last updated: 7/31/2026, 8:28:43 PM
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        previous = None
        current = head
        while current:
            forward = current.next
            current.next = previous
            previous = current
            current = forward
        return previous