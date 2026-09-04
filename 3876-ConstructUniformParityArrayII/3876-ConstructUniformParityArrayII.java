// Last updated: 9/4/2026, 3:17:55 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int smallest_odd = Integer.MAX_VALUE;
4        int smallest_even = Integer.MAX_VALUE;
5        for (int i = 0; i < nums1.length; i++) {
6            if (nums1[i] % 2 == 0) {
7                smallest_even = Math.min(smallest_even, nums1[i]);
8            }
9            else {
10                smallest_odd = Math.min(smallest_odd, nums1[i]);
11            }
12        }
13        if (smallest_odd == Integer.MAX_VALUE || smallest_even == Integer.MAX_VALUE) {
14            return true;
15        }
16        else return smallest_even > smallest_odd;
17    }
18}