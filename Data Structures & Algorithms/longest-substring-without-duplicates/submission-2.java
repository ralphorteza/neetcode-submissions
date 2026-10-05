class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int Max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
            int left = 0;
            int currVal = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            currVal = Math.max(currVal, right - left + 1);
        }

        return currVal;
    }
}
