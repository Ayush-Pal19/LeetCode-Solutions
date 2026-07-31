// Last updated: 7/31/2026, 8:29:11 PM
class Solution {
    public double Pow(double x, long N) {
        if (N==0) return 1; 
        double smol = Pow(x, N/2); 
        if (N%2==0) return smol*smol; 
        else return x*smol*smol;
    }
    public double myPow(double x, int n) {
        long N = n;
        if (N<0) {
            x = 1/x;
            N = -N;
        }
        return Pow(x,N);
    }
}