import java.util.Arrays;
class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] freq_s = new int[26];
        int[] freq_t = new int[26];

        for (int i = 0; i < s.length(); i++) {

            freq_s[s.charAt(i) - 'a']++;
            freq_t[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(freq_s, freq_t);
    }
}
    
