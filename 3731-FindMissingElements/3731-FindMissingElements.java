// Last updated: 8/4/2026, 2:34:33 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        boolean[] present = new boolean[101];
4        int mini = Integer.MAX_VALUE;
5        int maxm = Integer.MIN_VALUE;
6        
7        for (int x : nums) {
8            present[x] = true;
9            mini = Math.min(mini, x);
10            maxm = Math.max(maxm, x);
11        }
12
13        List<Integer> ans = new ArrayList<>();
14        for (int i = mini + 1; i < maxm; i++) {
15            if (!present[i]) {
16                ans.add(i);
17            }
18        }
19        return ans;
20    }
21}