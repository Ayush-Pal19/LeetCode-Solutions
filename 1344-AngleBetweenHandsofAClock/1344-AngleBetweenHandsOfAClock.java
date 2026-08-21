// Last updated: 8/10/2026, 6:28:25 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        // if (hour==12) hour=0;
        hour %= 12;
        //double hr = (hour*30)+((double)minutes/12)*6;
        double hr = hour * 30 + minutes * 0.5;
        double mi = minutes*6;
        double sol = Math.abs(hr-mi);
        sol = Math.min(sol , 360-sol);
        return sol;
    }
}