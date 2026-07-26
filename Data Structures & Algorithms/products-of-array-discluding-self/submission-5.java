class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length -1] = 1;
        for (int i=1; i<nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i=nums.length-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for (int i=0; i<nums.length; i++) {
            res[i] = left[i]*right[i];
        }
        return res;
        // int[] left = Arrays.copyOfRange(nums, 0, i);
        // int[] right = Arrays.copyOfRange(nums, i+1, nums.length);
        // int left_product = 1, right_product= 1;
        // for(int value : left) {left_product = left_product * value;}
        // for(int value : right) {right_product = right_product * value;}
        // res[i] = left_product * right_product;
        // }
        // return res;
    }
}  
