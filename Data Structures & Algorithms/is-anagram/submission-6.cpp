class Solution {
public:
    bool isAnagram(string s, string t) {

        if (s.size() != t.size()) return false;

        std::unordered_map<char, int> s_characters;
        std::unordered_map<char, int> t_characters;

        for (char s_char: s) {
            s_characters[s_char]++;
        }

        for (char t_char: t) {
            t_characters[t_char]++;
        }

        return t_characters == s_characters;
    }
};
