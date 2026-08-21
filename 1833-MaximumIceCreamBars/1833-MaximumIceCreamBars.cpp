// Last updated: 8/14/2026, 6:12:06 PM
1class Solution {
2public:
3    int maxIceCream(vector<int>& costs, int coins) {
4        sort(costs.begin(), costs.end());
5        int ice_cream_bought = 0;
6        for (int cost : costs) {
7            if (cost > coins) return ice_cream_bought;
8            ice_cream_bought++;
9            coins -= cost;
10        }
11        return ice_cream_bought;
12    }
13};