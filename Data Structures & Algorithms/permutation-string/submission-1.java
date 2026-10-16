class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = s1.length() - 1;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> currentMap = new HashMap<>();
        boolean match = true;

        if(s1.length() > s2.length()) return false;

        for (Character i : s1.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int j = l; j <= r; j++) {
            currentMap.put(s2.charAt(j), currentMap.getOrDefault(s2.charAt(j), 0) + 1);
        }

        while (r < s2.length()) {
            match = true;
            for (Character k : s1.toCharArray()) {
                if (!currentMap.containsKey(k) || (currentMap.get(k) != map.get(k))) {
                    match = false;
                    break;
                } 
            }
            if(match) {
                return true;
            }
            currentMap.put(s2.charAt(l), currentMap.get(s2.charAt(l)) - 1);
            l++;
            r++;
            if (r < s2.length()) {
                currentMap.put(s2.charAt(r), currentMap.getOrDefault(s2.charAt(r), 0) + 1);
            }
            
        }

        return false;
    }
}
