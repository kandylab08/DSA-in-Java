class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] charCountP = new int[26];
        int[] charCountS = new int[26];
        int n1 = s.length();
        int n2 = p.length();
        List<Integer> result = new ArrayList<>();
        if (n1 < n2)
            return result;
        for (int i = 0; i < n2; i++) {
            charCountP[p.charAt(i) - 'a']++;
            charCountS[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(charCountP, charCountS)) {
            result.add(0);
        }
        for (int i = n2; i < n1; i++) {
            charCountS[s.charAt(i) - 'a']++;
            int startIndex = i - n2 + 1;
            charCountS[s.charAt(startIndex - 1) - 'a']--;
            if (Arrays.equals(charCountP, charCountS)) {
                result.add(startIndex);
            }
        }
        return result;
    }
}