// Last updated: 8/25/2026, 12:54:35 PM
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        if (root == null) return true;
4        return helper(root.left, root.right);
5    }
6    public boolean helper(TreeNode left, TreeNode right) {
7        if (left == null && right == null) return true;
8        if (left == null || right == null) return false;
9        return left.val == right.val && helper(left.right, right.left) && helper(left.left, right.right);
10    }
11}