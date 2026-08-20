// Last updated: 8/20/2026, 7:38:05 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n = nums.length;
4        int[] arr1 = new int[n];
5        int[] arr2 = new int[n];
6
7        arr1[0] = nums[0];
8        arr2[0] = nums[1];
9
10        int i = 0;
11        int j = 0;
12        for (int k = 2; k < n; k++) {
13            if (arr1[i] > arr2[j]) {
14                arr1[++i] = nums[k];
15
16            }
17            else {
18                arr2[++j] = nums[k];
19            }
20        }
21        int idx = 0;
22        for (int k = 0; k <= i; k++) {
23            nums[idx++] = arr1[k];
24        }
25        for (int k = 0; k <= j; k++) {
26            nums[idx++] = arr2[k];
27        }
28        return nums;
29    }
30}