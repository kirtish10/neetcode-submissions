class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] cars = new int[position.length][2];
        ArrayList<Double> stack = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        for (int[] car : cars) {
            double tta = (double) (target - car[0]) / car[1];
            if (stack.isEmpty() || tta> stack.get(stack.size() - 1)) {
                stack.add(tta);
            }
        }
        return stack.size();
    }
}
