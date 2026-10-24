class Solution {
    public int search(int[] nums, int target) {
        int mid  = nums.length/2;
        int l = 0;
        int r = nums.length - 1;
        
        while(l <= r) {
            if(target == nums[mid]) {
                return mid;
            }
            if(target > nums[mid]) {
                l = mid + 1;
                mid = r + 1 / 2;
            } else {
                r = mid - 1;
                mid = r + 1 / 2;
            }
        }
        return -1;
    }
}
