class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int r = 0;
        int l = 0;
        int current_max = Integer.MIN_VALUE;
        int[] res = new int[nums.length - k + 1];

        Deque<Integer> q = new LinkedList<>();

        while(r < nums.length) {
                while(!q.isEmpty() && nums[q.peekLast()] < nums[r]) 
                {
                    q.pollLast();
                }
                q.offer(r);

                if(l > q.peek()) {
                    q.poll();
                }

                if((r+1) >= k) {
                    res[r-k+1] = nums[q.peek()];
                    l++;
                }
                r++;

        }

        return res;
        
    }
}
