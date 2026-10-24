class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || minStack.get(minStack.size() - 1) >= val) {
            minStack.add(val);
        }
        stack.add(val);
    }

    public void pop() {
        if (minStack.size() > 0
            && minStack.get(minStack.size() - 1).equals(stack.get(stack.size() - 1))){
            minStack.remove(minStack.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.get(minStack.size() - 1);
        }
        return -1;
    }
}
