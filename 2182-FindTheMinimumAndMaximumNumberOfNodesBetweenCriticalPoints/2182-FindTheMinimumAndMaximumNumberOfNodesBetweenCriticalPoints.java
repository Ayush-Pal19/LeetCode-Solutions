// Last updated: 7/31/2026, 8:27:48 PM
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        if (head.next.next == null) return ans;
        
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;

        int idx = 1;
        int first = -1;
        int last = -1;
        int min = Integer.MAX_VALUE;

        while (c != null) {
            if ((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)) {
                if (first==-1) {
                    first = idx;
                }
                else {
                    min = Math.min(min, idx-last);
                }
                last = idx;
            }
            a = a.next;
            b = b.next;
            c = c.next;
            idx++;
        }
        if (first==last) return ans;
        ans[0] = min;
        ans[1] = last-first;
        return ans;
    }
}