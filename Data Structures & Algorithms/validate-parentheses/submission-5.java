class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;
        

        HashMap<Character, Character> bracketMap = new HashMap<>();
        List<Character> stack = new ArrayList<>();

        bracketMap.put('{', '}');
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');

        for(int i=0; i< s.length(); i++) {
            
            if(bracketMap.containsKey(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else {
                if(i == 0) {
                    return false;
                }
                if (stack.size() > 0 && s.charAt(i) != bracketMap.get(stack.remove(stack.size() - 1)))
                {
                    return false;
                    }
            }
        }

        if(stack.size() == 0) return true; else return false;

    }
}
