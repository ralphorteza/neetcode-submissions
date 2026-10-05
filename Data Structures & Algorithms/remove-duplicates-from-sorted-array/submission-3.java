class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length ;

        while (right < len) {
        nums[left] = nums[right];
            while (right < len && nums[right] == nums[left]) {
                right++;
            }
            left++;
        }

        return left;
    }
}