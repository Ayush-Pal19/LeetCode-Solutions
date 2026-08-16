// Last updated: 8/16/2026, 2:38:41 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int depth = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                if (depth > 0) sb.append(ch);
9                depth++;
10            }
11            else {
12                depth--;
13                if (depth > 0) sb.append(ch);
14            }
15        }
16        return sb.toString();
17    }
18}