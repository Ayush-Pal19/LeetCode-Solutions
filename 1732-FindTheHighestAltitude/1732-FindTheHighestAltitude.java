// Last updated: 7/31/2026, 8:28:09 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }
}