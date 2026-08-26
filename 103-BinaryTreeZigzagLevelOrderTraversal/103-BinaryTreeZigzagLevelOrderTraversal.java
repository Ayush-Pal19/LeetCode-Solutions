// Last updated: 8/26/2026, 8:18:37 PM
1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Queue<TreeNode> q = new ArrayDeque<>();
5        int level = 0;
6        if (root != null) q.offer(root);
7        while (!q.isEmpty()) {
8            List<Integer> temp = new LinkedList<>();
9            int size = q.size();
10            for (int i = 0; i < size; i++) {
11                TreeNode curr = q.poll();
12                if (level % 2 == 0) {
13                    temp.addLast(curr.val);
14                }
15                else {
16                    temp.addFirst(curr.val);
17                }
18                if (curr.left != null) q.offer(curr.left);
19                if (curr.right != null) q.offer(curr.right);
20            }
21            ans.add(temp);
22            level++;
23        }
24        return ans;
25    }
26}