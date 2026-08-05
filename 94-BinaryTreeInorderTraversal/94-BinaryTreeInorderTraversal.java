// Last updated: 8/5/2026, 6:57:31 PM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        List<Integer> ans = new ArrayList<>();
4        dfs(root, ans);
5        return ans;
6    }
7    public void dfs(TreeNode root, List<Integer> arr) {
8        if (root == null) return;
9        dfs(root.left, arr);
10        arr.add(root.val);
11        dfs(root.right, arr);
12    }
13}