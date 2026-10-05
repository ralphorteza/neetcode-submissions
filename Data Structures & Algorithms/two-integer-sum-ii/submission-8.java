class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIdx = 0;
        int rightIdx = numbers.length -1;

        while (leftIdx < rightIdx) {
            int sumVal = numbers[leftIdx] + numbers[rightIdx];
            if (sumVal == target) break;
            if (sumVal > target) {
                rightIdx--;
            }
            if (sumVal < target) {
                leftIdx++;
            }
        }

        return new int[] {leftIdx+1, rightIdx+1};
    }
}
