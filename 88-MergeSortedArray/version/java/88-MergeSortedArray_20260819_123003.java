// Last updated: 8/19/2026, 12:30:03 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        if (n == 0) return;
4        
5        int i = m-1;
6        int j = n-1;
7        int k = m + n - 1;
8
9        while (j >= 0) {
10            if (i >= 0 && nums1[i] > nums2[j]) {
11                nums1[k--] = nums1[i--];
12            }
13            else {
14                nums1[k--] = nums2[j--];
15            }
16        }
17    }
18}