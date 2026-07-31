// Last updated: 7/31/2026, 8:29:08 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = head1;
        ListNode t2 = head2;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                ListNode next = t1.next;
                t1.next = null;
                temp.next = t1;
                t1 = next;
            }
            else {
                ListNode next = t2.next;
                t2.next = null;
                temp.next = t2;
                t2 = next;
            }
            temp = temp.next;
        }
        if (t1 == null) temp.next = t2;
        else temp.next = t1;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;
        
        ArrayList<ListNode> arr1 = new ArrayList<>();
        ArrayList<ListNode> arr2 = new ArrayList<>();
        arr1.addAll(Arrays.asList(lists));

        while (arr1.size()+arr2.size() > 1) {
            while (arr1.size()>=2) {
                arr2.add(
                    merge(
                        arr1.remove(arr1.size()-1),
                        arr1.remove(arr1.size()-1)
                    )
                );
            }
            if (!arr1.isEmpty()) arr2.add(arr1.remove(0));
            while (arr2.size()>=2) {
                arr1.add(
                    merge(
                        arr2.remove(arr2.size()-1),
                        arr2.remove(arr2.size()-1)
                    )
                );
            }
            if (!arr2.isEmpty()) arr1.add(arr2.remove(0));
        }
        return arr1.isEmpty() ? arr2.get(0) : arr1.get(0);
    }
}