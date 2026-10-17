class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> currentMap = new HashMap<>();

        if (t.length() > s.length())
            return "";

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int need = map.size();
        int have = 0;

        int[] res = new int[2];
        int resLength = Integer.MAX_VALUE;

        for (int i = r; i < s.length(); i++) {
            currentMap.put(s.charAt(i), currentMap.getOrDefault(s.charAt(i), 0) + 1);

            if (map.containsKey((s.charAt(i)))
                && map.get(s.charAt(i)).equals(currentMap.get(s.charAt(i)))) {
                have += 1;
            }
            while (have == need) {
                if (i - l + 1 < resLength) {
                    res[0] = l;
                    res[1] = i;
                    resLength = i - l + 1;
                }
                currentMap.put(s.charAt(l), currentMap.get(s.charAt(l)) - 1);

                if (map.containsKey(s.charAt(l))
                    && currentMap.get(s.charAt(l)) < map.get(s.charAt(l))) {
                    have -= 1;
                }
                l += 1;
            }
        }

        String fres = s.substring(res[0], res[1] + 1);

        if (resLength != Integer.MAX_VALUE )
            return fres;
        else
            return "";
    }
}
