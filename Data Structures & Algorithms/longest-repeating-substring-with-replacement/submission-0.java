class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;

        for (r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            if ((r - l + 1) - Collections.max(map.values()) <= k) {
                res = Math.max(res, r - l + 1);
            } else {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
        }
        return res;
    }
}
