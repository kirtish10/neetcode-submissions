class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for(int num : map.keySet()) {
            heap.add(num);
        }
        
        int[] array = new int[k];
        for(int i = 0; i< array.length; i++) {
            array[i] = heap.poll();
        }
        return array;
    }
}
