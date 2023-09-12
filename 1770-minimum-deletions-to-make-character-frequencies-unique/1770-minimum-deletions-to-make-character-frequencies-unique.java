class Solution {
     public int minDeletions(String s) {
        int[] freq = new int[26];
        int result = 0;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0 && !isUnique(freq, i)) {
                freq[i]--;
                result++;
            }
        }
        return result;
    }
    private boolean isUnique(int[] freq, int index) {
        for (int i = 0; i < 26; i++) {
            if (i != index && freq[i] == freq[index]) {
                return false;
            }
        }
        return true;
    }
}