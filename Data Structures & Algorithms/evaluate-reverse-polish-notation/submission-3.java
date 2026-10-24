class Solution {
    int applyOperator(Character c, int a, int b) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a* b;
            case '/' -> {
                if (b == 0)
                    yield 0;
                yield a / b;
            }
            default -> 0;
        };
    }

    public int evalRPN(String[] tokens) {

        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        ArrayList<Integer> intArray = new ArrayList<>();

        for (String c : tokens) {
            if (c.length() > 1 || Character.isDigit(c.charAt(0))) {
                intArray.add(Integer.parseInt(c));
            } else {
                int b = intArray.remove(intArray.size() - 1);
                int a = intArray.remove(intArray.size() - 1);
                Character operator = c.charAt(0);
                intArray.add(applyOperator(operator, a, b));
            }
        }

        return intArray.get(0);
    }
}
