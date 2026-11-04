class Solution {
public:
    int characterReplacement(string s, int k) {
        int res = 0;
        std::set<char> charSet;
        for (char c: s) {
            charSet.insert(c);
        }

        for (char c: charSet) {
            int left = 0;
            int count = 0;

            for (int right = 0; right < s.length(); right++) {
                if (s[right] == c) count++;
                while ((right - left + 1) - count > k) {
                    // cout << "s[left]: " << s[left] << '\n';
                    if (s[left] == c) count--;
                    left++;
                }
                if (res < (right - left + 1)) res = right - left + 1;
                // cout << "result: " << res << '\n';
            }
        }
        return res;
    }
};
