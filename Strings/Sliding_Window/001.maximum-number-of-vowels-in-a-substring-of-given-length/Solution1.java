class Solution {
    public int maxVowels(String s, int k) {
        char[] str = s.toCharArray();
        int curVowel = 0;
        for (int i = 0; i < k; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
                curVowel++;
        }
        int maxVowel = curVowel;
        for (int i = k; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
                curVowel++;
            if (str[i - k] == 'a' || str[i - k] == 'e' || str[i - k] == 'i' || str[i - k] == 'o' || str[i - k] == 'u')
                curVowel--;
            maxVowel = Math.max(maxVowel, curVowel);
        }
        return maxVowel;
    }
}