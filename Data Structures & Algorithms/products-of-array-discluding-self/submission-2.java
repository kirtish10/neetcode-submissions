class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
        int[] left = Arrays.copyOfRange(nums, 0, i);
        int[] right = Arrays.copyOfRange(nums, i+1, nums.length);
        int left_product = 1;
        int right_product = 1;
        for(int value : left) {left_product = left_product * value;}
        for(int value : right) {right_product = right_product * value;}
        res[i] = left_product * right_product;
        }
        return res;
    }
}  
