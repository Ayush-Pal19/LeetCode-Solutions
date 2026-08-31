// Last updated: 8/31/2026, 6:37:42 PM
1class Solution {
2public:
3    vector<int> nodesBetweenCriticalPoints(ListNode* head) {
4        if (!head || !head->next || !head->next->next) return {-1,-1};
5
6        ListNode* a = head;
7        ListNode* b = head->next;
8        ListNode* c = head->next->next;
9
10        int idx = 1;
11        int last_idx = -1;
12        int first_idx = -1;
13
14        int min_dist = INT_MAX;
15        int max_dist = -1;
16
17        while (c) {
18            if ((b->val < a->val && b->val < c->val) || (b->val > a->val && b->val > c->val)) {
19                // b is a critical point.
20                if (first_idx == -1) {
21                    first_idx = idx;
22                }
23                else {
24                    min_dist = min(min_dist, idx - last_idx);
25                }
26                last_idx = idx;
27            }
28            a = a->next;
29            b = b->next;
30            c = c->next;
31            idx++;
32        }
33        
34        if (first_idx == -1 || first_idx == last_idx) return {-1, -1};
35        
36        max_dist = last_idx - first_idx;
37        return {min_dist, max_dist};
38    }
39};