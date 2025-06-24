class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // if (k == 1) return new int[]{nums[0]};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i< nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int[] output = new int[k];

        for (int i=0; i < k; i++) {
            output[i] = entryList.get(i).getKey();
        }
        return output;
    }
}