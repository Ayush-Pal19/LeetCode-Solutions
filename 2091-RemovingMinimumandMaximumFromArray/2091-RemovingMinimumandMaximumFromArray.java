// Last updated: 8/30/2026, 1:31:03 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        
5        int min = Integer.MAX_VALUE;
6        int min_idx = -1;
7
8        int max = Integer.MIN_VALUE;
9        int max_idx = -1;
10
11        for (int i = 0; i < n; i++) {
12            if (nums[i] < min) {
13                min = nums[i];
14                min_idx = i + 1;
15            }
16            if (nums[i] > max) {
17                max = nums[i];
18                max_idx = i + 1;
19            }
20        }
21
22        int scenario1 = Math.max(min_idx, max_idx);
23        int scenario2 = Math.max(n - min_idx + 1, n - max_idx + 1);
24        
25        int front_removal = Math.min(min_idx, max_idx);
26        int back_removal = Math.min(n - min_idx + 1, n - max_idx + 1);
27        int scenario3 = front_removal + back_removal;
28        
29        return Math.min(Math.min(scenario1, scenario2), scenario3);
30    }
31}