// Last updated: 8/18/2026, 2:10:36 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4        if (k == n) {
5            int largest = Integer.MIN_VALUE;
6            for (int x : nums) {
7                largest = Math.max(largest, x);
8            }
9            return largest;
10        }
11        int[] freq = new int[51];
12        for (int x : nums) {
13            freq[x]++;
14        }
15
16        if (k == 1) {
17            for (int i = 50; i >= 0; i--) {
18                if (freq[i] == 1) return i;
19            }
20            return -1;
21        }
22
23        int result = -1;
24        if (freq[nums[0]] == 1) {
25            result = Math.max(result, nums[0]);
26        }
27        if (freq[nums[n - 1]] == 1) {
28            result = Math.max(result, nums[n - 1]);
29        }
30        return result;
31    }
32}