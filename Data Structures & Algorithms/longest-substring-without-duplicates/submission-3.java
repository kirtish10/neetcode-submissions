class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;
        int max_window = 0;
        HashSet<Character> seen  = new HashSet<>();

        while(r < s.length()) {
            while(seen.contains(s.charAt(r)))
            {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            max_window = Math.max(max_window, r - l + 1);
            r++;
        }
        return max_window;
    }
}