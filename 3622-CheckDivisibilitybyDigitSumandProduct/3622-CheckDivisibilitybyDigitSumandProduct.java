// Last updated: 8/24/2026, 7:21:12 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum = 0;
4        int product = 1;
5        int temp = n;
6        while (temp > 0) {
7            sum += temp % 10;
8            product *= temp % 10;
9            temp /= 10;
10        }
11        return n % (sum + product) == 0;
12    }
13}
14