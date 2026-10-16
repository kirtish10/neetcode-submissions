class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] res = new int[2];

        while(i <= j) {
            int current = numbers[i] + numbers[j];
            if(current > target) {
                j--;
            } else if (current < target) {
                i++;
            } else {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }

    return res;
    }
}
