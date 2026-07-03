class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] output = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(target == nums[i] + nums[j]) {
        //             output[0] = i;
        //             output[1] = j;
        //             return output;
        //          }
        //     }
        // }
        // return output;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
