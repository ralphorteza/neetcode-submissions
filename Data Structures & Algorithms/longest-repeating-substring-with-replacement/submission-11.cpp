class Solution {
public:
    int characterReplacement(string s, int k) {
        std::set<char> charSet;
        int result = 0;
        for (char ch: s) {
            charSet.insert(ch);
        }

        for (char currChar: charSet) {
            int left = 0;
            int count = 0;

            for (int right = 0; right < s.size(); right++) {
                if (s[right] == currChar) count++;

                while ((right - left + 1 - count) > k) {
                    if (s[left] == currChar) count--;
                    left++;
                }
                
                if (result < (right - left + 1)) result = right - left + 1;

            }


        }
        return result;
    }
};
