// Last updated: 7/31/2026, 8:27:34 PM
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        
        int pushes = 0;
        int validPush = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            pushes += ((validPush / 8) + 1) * freq[i];
            validPush++;
        }
        
        return pushes;
    }
}