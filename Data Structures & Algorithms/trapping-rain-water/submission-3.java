class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        int left_max = height[l];
        int right_max = height[r];

        while(l<r) {
            if(left_max < right_max) {
                l++;
                left_max = Math.max(left_max, height[l]);
                res = res + left_max - height[l];
            } else {
                r--;
                right_max = Math.max(right_max, height[r]);
                res = res + right_max - height[r];
            }
        }
        return res;
    }
}
