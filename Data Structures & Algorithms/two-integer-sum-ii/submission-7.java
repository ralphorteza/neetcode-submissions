class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIdx = 0;
        int rightIdx = numbers.length -1;

        while (leftIdx < rightIdx) {
            int sumVal = numbers[leftIdx] + numbers[rightIdx];
            if (sumVal > target) {
                rightIdx--;
            } else if (sumVal < target) {
                leftIdx++;
            } else {
                break;
            }
        }

        return new int[] {leftIdx+1, rightIdx+1};
    }
}
