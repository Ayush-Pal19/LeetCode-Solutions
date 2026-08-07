// Last updated: 8/7/2026, 6:29:31 PM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        List<Integer> ans = new ArrayList<>();
4        Deque<TreeNode> st = new ArrayDeque<>();
5        TreeNode curr = root;
6        
7        while (curr != null || !st.isEmpty()) {
8            while (curr != null) {
9                st.push(curr);
10                curr = curr.left;
11            }
12            curr = st.pop();
13            ans.add(curr.val);
14            curr = curr.right;
15        }
16        return ans;
17    }
18}