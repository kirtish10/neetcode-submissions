class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = cleanString.toCharArray();
        System.out.println(chars);
        int i = 0;
        int j = chars.length-1;
        while(i < j) {
            if(chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;   
    }
}
