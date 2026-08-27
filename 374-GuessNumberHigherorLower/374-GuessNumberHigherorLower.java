// Last updated: 8/27/2026, 12:44:30 PM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int left = 1;
13        int right = n;
14
15        while (left <= right) {
16            int mid = left + (right - left) / 2;
17            int apiresult = guess(mid);
18
19            if (apiresult == -1) right = mid - 1;
20            else if (apiresult == 1) left = mid + 1;
21            else return mid;
22        }
23        return -1;
24    }
25}