// Last updated: 9/6/2026, 12:20:03 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int max_in_left = nums[0];
5        int[] min_in_right = new int[n];
6        
7        min_in_right[n - 1] = nums[n - 1];
8        for (int i = n - 2; i >= 0; i--) {
9            min_in_right[i] = Math.min(nums[i], min_in_right[i + 1]);
10        }
11
12        for (int i = 0; i < n; i++) {
13            max_in_left = Math.max(max_in_left, nums[i]);
14            int i_score = max_in_left - min_in_right[i];
15
16            if (i_score <= k) return i;
17        }
18
19        return -1;
20    }
21}