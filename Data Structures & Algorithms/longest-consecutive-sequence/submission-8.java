class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        Arrays.sort(nums);

        int right = 0;
        int left = nums[0];
        int streak = 0;
        int maxVal = Integer.MIN_VALUE;

        while (right < nums.length) {
            if (left != nums[right]) {
                left = nums[right];
                streak = 0;
            }

            while ( (right < nums.length) && (nums[right] == left)) {
                right++;
            }
            streak++;
            left++;
            maxVal = Math.max(maxVal, streak);
        }

        return nums.length == 0 ? 0: maxVal;
    }
}
