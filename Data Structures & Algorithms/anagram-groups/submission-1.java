class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            int[] countArray = new int[26];
            for ( char value : strs[i].toCharArray()) {
                countArray[value - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<26; j++) {
                sb.append(countArray[j]);
                sb.append(";");
            }

            String codedString = sb.toString();
            if(map.containsKey(codedString)) {
                List<String> list = map.get(codedString);
                list.add(strs[i]);
                map.put(codedString, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(codedString, list);
            }
        }

        List<List<String>> list = new ArrayList<>();
            for (List<String> val : map.values()) {
                list.add(val);
            }
            return list;

        // for(int i = 0; i < strs.length; i++) {
        //     char[] chars = strs[i].toCharArray();
        //     Arrays.sort(chars);        
        //     String sorted = new String(chars);
        //     if(map.containsKey(sorted)) {
        //        List<String> value = map.get(sorted);
        //        value.add(strs[i]);
        //         map.put(sorted, value);
        //     } else {
        //         List<String> value = new ArrayList<>();
        //         value.add(strs[i]);
        //         map.put(sorted, value);
        //     }
        // }

        // List<List<String>> list = new ArrayList<>();
        // for (List<String> value : map.values()) {
        //     list.add(value);
        // }

        // return list;

    }
}
