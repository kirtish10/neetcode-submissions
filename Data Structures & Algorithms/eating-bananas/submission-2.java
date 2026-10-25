class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int top = Arrays.stream(piles).max().getAsInt();
        int bot = 1;
        int res = top;


        while(bot <= top) {
            long hours = 0;
            int mid = bot + (top - bot)/2;

            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h) {
                res = mid;
                top = mid - 1;
            } else {
                bot = mid + 1;
            }
        }

        return res;
    }
}
