// Last updated: 7/31/2026, 8:28:27 PM
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while (j > i) {
            char t = s[i];
            s[i++] = s[j];
            s[j--] = t;
        }
    }
}