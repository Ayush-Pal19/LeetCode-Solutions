// Last updated: 9/1/2026, 7:10:56 PM
1class Solution {
2public:
3    void reverseString(vector<char>& s) {
4        int i = 0;
5        int j = s.size() - 1;
6
7        while (i < j) {
8            char t = s[i];
9            s[i++] = s[j];
10            s[j--] = t;
11        }
12    }
13};