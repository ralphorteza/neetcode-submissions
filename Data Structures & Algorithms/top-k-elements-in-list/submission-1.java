class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length < 2) return nums;
        HashMap<Integer, Integer> num_freq = new HashMap<>();

        for (int num: nums) {
            if (!num_freq.containsKey(num)) {
                num_freq.put(num, 0);
            }
            num_freq.put(num, num_freq.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(num_freq.entrySet());
        // System.out.println(list+"\n");

        // list.sort(Map.Entry.comparingByValue(Collections.reversedOrder()));
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));  



        // Set<Integer> kKeys = 
        int[] largestValueArr = new int[k];
        // System.out.println(list+"hello");
        int i = 0;
        for (Map.Entry<Integer,Integer> entry: list){
            if (k == i) break;
            largestValueArr[i] = entry.getKey();
            i++;
        }
        return largestValueArr;
    }
}
