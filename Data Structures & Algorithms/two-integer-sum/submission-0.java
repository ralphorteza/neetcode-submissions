class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int curr_num = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (curr_num - nums[j] == 0) {
                    arr[1] = i;
                    arr[0] = j;
                    break;
                }

            }
        }

        return arr;
    }
}
