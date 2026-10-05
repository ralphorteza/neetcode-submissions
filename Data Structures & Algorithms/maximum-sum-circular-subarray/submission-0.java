class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int numsLength = nums.length;
        int maxSum = nums[0];
        int currSum = 0;

        for (int i = 0; i < numsLength; i++) {
            currSum = 0;
            for (int j = i; j < i + numsLength; j++) {
                currSum += nums[j % numsLength];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;

        
    }
}