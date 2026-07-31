# Last updated: 7/31/2026, 8:29:03 PM
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0 :
            return 1
        if n < 0 :
            x = 1/x
            n = -n
        smol = self.myPow(x,n//2)
        if n%2==0 : 
            return smol*smol
        else : 
            return x*smol*smol