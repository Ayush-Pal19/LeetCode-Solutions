// Last updated: 8/6/2026, 9:00:52 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        for (int i = n; i < n + 10; i++) {
4            int product = 1;
5            int num = i;
6            while (num > 0) {
7                product *= num % 10;
8                num /= 10;
9            }
10            if (product % t == 0) return i;
11        }
12        return -1;
13    }
14}