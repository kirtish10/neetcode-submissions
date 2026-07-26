class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);        
            String sorted = new String(chars);
            if(map.containsKey(sorted)) {
               List<String> value = map.get(sorted);
               value.add(strs[i]);
                map.put(sorted, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                map.put(sorted, value);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (List<String> value : map.values()) {
            list.add(value);
        }

        return list;

    }
}
