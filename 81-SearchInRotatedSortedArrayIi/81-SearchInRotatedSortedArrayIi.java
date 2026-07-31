// Last updated: 7/31/2026, 8:28:50 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            // System.out.println("i: " + i + " j: " + j + " mid: " + mid);
            if (nums[mid] == target) return true;
            if (nums[i] == nums[mid] && nums[j] == nums[mid]) {
                i++;
                j--;
            }
            else if (nums[mid] >= nums[i]) {
                //Left Sorted
                if (target >= nums[i] && target < nums[mid]) j = mid - 1;
                else i = mid + 1;
            }
            else {
                //Right Sorted
                if (target > nums[mid] && target <= nums[j]) i = mid + 1;
                else j = mid - 1;
            }
        }
        return false;
    }
}