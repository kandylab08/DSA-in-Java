import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String pat = new String(chars);

            if (!mp.containsKey(pat)) {
                mp.put(pat, new ArrayList<>());
            }

            mp.get(pat).add(s);
        }

        return new ArrayList<>(mp.values());
    }
};