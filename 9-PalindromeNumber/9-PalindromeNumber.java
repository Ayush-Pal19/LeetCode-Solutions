// Last updated: 7/31/2026, 8:29:19 PM
class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0 || (x%10==0 && x!=0)) return false;
        int ans = 0;
        while (x > ans) {
            ans = ans*10 + x%10;
            x /= 10;
        }
        return (x==ans || x==ans/10);
    }
}