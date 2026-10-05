class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        int left = 0;
        
        while (left < numbers.length) {
            int diff = target - numbers[left];

            if (map.containsKey(diff)) {
                return new int[] {left+1, map.get(diff) + 1};
            }
            left++;
        }

        return new int[] {}; 
    }
}
