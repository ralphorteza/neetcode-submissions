class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }

        std::unordered_map<char, int> sCount;
        std::unordered_map<char, int> tCount;

        for (int i = 0; i < s.length(); i++) {
            sCount[s[i]]++;
            tCount[t[i]]++;
        }

        return sCount == tCount;
    }
};
