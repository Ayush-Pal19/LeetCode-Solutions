// Last updated: 8/17/2026, 3:38:18 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        ans[0] = 1;
6        // Prefix product of the first element of array is 1.
7        for (int i = 1; i < n ; i++) {
8            ans[i] = ans[i-1] * nums[i-1];
9            // We're updating value of ans[i] with prefix product of it, i.e product of every number predating it in original nums[] array.
10        }
11        int suffix_product = 1;
12        // suffix_product stores the product of elements after nums[i+1].
13        for (int i = n-2; i >= 0; i--) {
14            // Multiplying suffix_product by nums[i+1] gives the value of suffix product for element at index i.
15            ans[i] *= suffix_product * nums[i+1];
16            suffix_product *= nums[i+1];
17        }
18        return ans;
19    }
20}