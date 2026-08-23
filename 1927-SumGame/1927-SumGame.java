// Last updated: 8/23/2026, 1:42:05 PM
1class Solution {
2    public boolean sumGame(String num) {
3        int n = num.length();
4        int qLeft = 0, sumLeft = 0, qRight = 0, sumRight = 0;
5        
6        for (int i = 0; i < n / 2; i++) {
7            char curr = num.charAt(i);
8            if (curr == '?') qLeft++;
9            else sumLeft += curr - '0';
10        }
11        for (int i = n / 2; i < n; i++) {
12            char curr = num.charAt(i);
13            if (curr == '?') qRight++;
14            else sumRight += curr - '0';
15        }
16
17        return 2 * (sumLeft - sumRight) != (qRight - qLeft) * 9;
18    }
19}
20