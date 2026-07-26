class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxStreak =1;
        for(int i : set) {
        if(!set.contains(i-1)) {
            
                int count = 1;
                int current_element = i;

                while(set.contains(current_element+1)) {
                    count += 1;
                    current_element += 1;
                }
            maxStreak = Math.max(maxStreak,count);
        }
    }
    return maxStreak;
}
}