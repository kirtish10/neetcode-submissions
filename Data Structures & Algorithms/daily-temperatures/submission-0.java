class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> stack = new ArrayList<>(0);
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.add(i);
            } else {
                while (!stack.isEmpty() &&temperatures[i] > temperatures[stack.get(stack.size() - 1)]) {
                    int position = stack.remove(stack.size() - 1);
                    res[position] = i - position;
                }
                stack.add(i);
            }
        }

        return res;
    }
}
