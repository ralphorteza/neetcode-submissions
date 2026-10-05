class Solution {
    public int maxArea(int[] heights) {
        int curr = 0;
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left != right) {
            int minLevel = Math.min(heights[left], heights[right]);
            int width = Math.abs(right - left);

            curr = minLevel * width;
            max = Math.max(curr, max);
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;

    }
}
