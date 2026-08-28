// Last updated: 8/28/2026, 12:24:34 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4        for (int i = 0; i < numRows; i++) {
5            int number = 1;
6            List<Integer> temp = new ArrayList<>(i+1);
7            for (int j = 0; j <= i; j++) {
8                temp.add(number);
9                number =  number * (i - j) / (j + 1);
10            }
11            ans.add(temp);
12        }
13        return ans;
14    }
15}