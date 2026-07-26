class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> decoded_strs = new ArrayList<>();
        while(i < str.length()) {
         int nextHash = str.indexOf('#',i);
         int wordLength = Integer.parseInt(str.substring(i, nextHash));
         int wordStart = nextHash+1;
         int wordEnd = wordStart + wordLength;
         decoded_strs.add(str.substring(wordStart, wordEnd));
         i = wordEnd;
        }

        return decoded_strs;
    }
}
