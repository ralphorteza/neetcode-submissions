class Solution {
public:
    int characterReplacement(string s, int k) {
        std::set<char> charFreq;
        int result = 0;
        for (char ch: s) {
            charFreq.insert(ch);
        }

        for (char ch: charFreq) {
            int left = 0;
            int count = 0;

            for (int right = 0; right < s.size(); right++) {
                if (s[right] == ch) count++;

                while ((right - left + 1 - count) > k) {
                    if (s[left] == ch) count--;
                    left++;
                }

                if (result < (right - left + 1)) result = right - left + 1;

            }

        }
        return result;
    }
};
