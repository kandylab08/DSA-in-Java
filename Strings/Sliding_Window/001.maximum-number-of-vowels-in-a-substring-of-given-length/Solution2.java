class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int curVowel = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                curVowel++;
        }

        int maxVowel = curVowel;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                curVowel++;

            if (isVowel(s.charAt(i - k)))
                curVowel--;

            maxVowel = Math.max(maxVowel, curVowel);

            if (maxVowel == k)
                return k;
        }

        return maxVowel;
    }
}