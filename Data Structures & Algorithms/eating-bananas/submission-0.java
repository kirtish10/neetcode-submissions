class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int bot = 1;
        int res = 0;
        int top =  Arrays.stream(piles).max().getAsInt();
        
        while(bot <= top) {
        long hours = 0;
        int mid = bot + (top - bot)/ 2;
        for(int i = 0; i < piles.length; i++ ) {
            hours += (piles[i] + mid - 1) / mid;
        }
        if(hours <= h ) {
            res = mid;
            top = mid - 1;
        } else  {
            bot = mid + 1;
        }
        }

        return res;
    }
}
