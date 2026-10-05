class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int numsLen = nums.length;
        for (int L = 0; L < nums.length; L++) {
            for (int R = L + 1; R < Math.min(numsLen, L + k+1); R++) {
                if (nums[L] == nums[R]) return true;
            }
        }
        return false;
    }
}