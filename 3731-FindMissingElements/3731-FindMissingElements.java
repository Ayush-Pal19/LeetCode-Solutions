// Last updated: 8/8/2026, 3:26:08 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] present = new boolean[101];
        int mini = Integer.MAX_VALUE;
        int maxm = Integer.MIN_VALUE;
        
        for (int x : nums) {
            present[x] = true;
            mini = Math.min(mini, x);
            maxm = Math.max(maxm, x);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = mini + 1; i < maxm; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}