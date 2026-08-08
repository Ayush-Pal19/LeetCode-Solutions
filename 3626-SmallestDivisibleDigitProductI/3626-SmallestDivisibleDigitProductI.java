// Last updated: 8/8/2026, 3:26:06 PM
class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; i < n + 10; i++) {
            int product = 1;
            int num = i;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            if (product % t == 0) return i;
        }
        return -1;
    }
}