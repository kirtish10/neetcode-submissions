class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int max_window = 0;
        HashSet<Character> seen = new HashSet<>();

        while(j < s.length()) {
            while(seen.contains(s.charAt(j))){
                seen.remove(s.charAt(i));
                i = i+1;                
            }
                max_window = Math.max(max_window, j - i + 1) ;
                seen.add(s.charAt(j));
                j++;
            }

        return max_window;

    }
}