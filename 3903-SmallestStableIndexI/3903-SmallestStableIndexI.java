// Last updated: 9/4/2026, 2:08:05 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int max_from_left = nums[0];
5        int[] min_from_right = new int[n];
6
7        min_from_right[n - 1] = nums[n - 1];
8        for (int i = n - 2; i >= 0; i--) {
9            min_from_right[i] = Math.min(nums[i], min_from_right[i+1]);
10        }
11
12        for (int i = 0; i < n; i++) {
13            max_from_left = Math.max(max_from_left, nums[i]);
14
15            int instability_score = max_from_left - min_from_right[i];
16            if (instability_score <= k) {
17                return i;
18            }
19        }
20        return -1;
21    }
22}