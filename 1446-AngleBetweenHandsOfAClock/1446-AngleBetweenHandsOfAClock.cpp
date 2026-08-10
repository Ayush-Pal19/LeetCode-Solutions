// Last updated: 8/10/2026, 5:54:46 PM
class Solution {
public:
    double angleClock(int hour, int minutes) {
        hour %= 12;
        double angle_hr = hour * 30 + minutes * 0.5;
        double angle_minutes = minutes * 6;
        double final_angle = std::abs(angle_hr - angle_minutes);
        return std::min(final_angle, 360- final_angle);
    }
};