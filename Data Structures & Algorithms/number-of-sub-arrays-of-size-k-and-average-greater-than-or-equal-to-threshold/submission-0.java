class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count  = 0;
        int left = 0;
        int kSum = 0;

        for (int right = 0; right < arr.length; right++) {
            if (right - left + 1> k) {
                kSum -= arr[left];
                left++;

            }
            kSum += arr[right];

            if (right - left + 1== k) {
                int avg = kSum/k;
                if (avg >= threshold) count++;
            }
        }
        return count;
    }
}