// Last updated: 8/10/2026, 5:53:01 PM
1class Solution {
2public:
3    double angleClock(int hour, int minutes) {
4        hour %= 12;
5        double angle_hr = hour * 30 + minutes * 0.5;
6        double angle_minutes = minutes * 6;
7        double final_angle = std::abs(angle_hr - angle_minutes);
8        return std::min(final_angle, 360- final_angle);
9    }
10};