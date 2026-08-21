// Last updated: 7/31/2026, 8:27:51 PM
class Solution {
    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x%y);
    }
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxm = Integer.MIN_VALUE;

        for (int x : nums) {
            mini = Math.min(mini, x);
            maxm = Math.max(maxm, x);
        }

        return gcd(mini,maxm);
    }
}