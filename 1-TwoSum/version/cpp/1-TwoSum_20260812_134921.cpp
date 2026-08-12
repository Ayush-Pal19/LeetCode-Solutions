// Last updated: 8/12/2026, 1:49:21 PM
1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4        for (int i = 0; i < nums.size(); i++) {
5            for (int j = i+1; j < nums.size(); j++) {
6                if ((nums[i]+nums[j]) == target) {
7                    return {i, j};
8                }
9            }
10        }
11        return {};
12    }
13};