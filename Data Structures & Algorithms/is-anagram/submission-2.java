class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(smap.containsKey(s.charAt(i))) {
                smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
            } else {
                smap.put(s.charAt(i),1);
            }
            if(tmap.containsKey(t.charAt(i))) {
                tmap.put(t.charAt(i), tmap.get(t.charAt(i))+1);
            } else {
                tmap.put(t.charAt(i),1);
            }
        }
            if (smap.equals(tmap)) return true;
            else return false;
        
    }
}
