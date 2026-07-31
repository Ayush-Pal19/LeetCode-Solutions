// Last updated: 7/31/2026, 8:27:32 PM
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        for (int i = 0; i < n; i++) {
            pushes += i/8 + 1;
        }
        return pushes;
    }
}