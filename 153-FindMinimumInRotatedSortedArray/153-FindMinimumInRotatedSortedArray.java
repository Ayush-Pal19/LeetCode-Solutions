// Last updated: 7/31/2026, 8:28:46 PM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int firstTrueIdx = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= nums[n-1]) {
                firstTrueIdx = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return nums[firstTrueIdx];
    }
}