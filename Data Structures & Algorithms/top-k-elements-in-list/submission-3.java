class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(Map.Entry<Integer,Integer> pair : map.entrySet()) {
            if(buckets[pair.getValue()] != null) {
                buckets[pair.getValue()].add(pair.getKey());
            } else {
                buckets[pair.getValue()] = new ArrayList<Integer>();
                buckets[pair.getValue()].add(pair.getKey());
            }
        }
        
        int[] result = new int[k];
        
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
        if (buckets[i] != null) {
            for (int num : buckets[i]) {
                result[index] = num;
                index++;
                if (index == k) return result;
            }
        }
        }
        return result;
        // for(int num : map.keySet()) {
        //     heap.add(num);
        // }
        
        // int[] array = new int[k];
        // for(int i = 0; i< array.length; i++) {
        //     array[i] = heap.poll();
        // }
        // return array;
    }
}
