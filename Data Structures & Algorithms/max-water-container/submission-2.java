class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max_area = 0;
        while(i <= j) {
            int current_area = Math.min(heights[i],heights[j]) * (j-i);
            if (max_area < current_area) {
                max_area = current_area;
            }
            if(Math.min(heights[i],heights[j]) == heights[i]) i++; else j--;
        }
        return max_area;
    }
}
