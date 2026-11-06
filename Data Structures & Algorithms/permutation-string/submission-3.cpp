class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if (s1.size() > s2.size()) return false;
        std::vector<int> s1Array (26, 0);
        std::vector<int> s2Array (26, 0);

        for (int i = 0; i < s1.size(); i++) {
            // int s1Char = s1[i] - 'a';
            // int s2Char = s2[i] - 'a';
            // cout << "s1 curr num: " << s1Char << "\t s2 curr num: " << s2Char << '\n';
            s1Array[s1[i] - 'a']++;
            s2Array[s2[i] - 'a']++;
        }

        int matches = 0;

        for (int i = 0; i < 26; i++) {
            if (s1Array[i] == s2Array[i]) matches++;
        }

        int left = 0;
        for (int right = s1.size(); right < s2.size(); right++) {
            if (matches == 26) return true;

            int letter = s2[right] - 'a';
            s2Array[letter]++;

            if (s1Array[letter] == s2Array[letter]) matches++;
            else if (s1Array[letter] + 1 == s2Array[letter]) matches--;

            letter = s2[left] - 'a';

            s2Array[letter]--;
            if (s1Array[letter] == s2Array[letter]) matches++;
            else if (s1Array[letter] - 1 ==  s2Array[letter]) matches --;

            left++;
        }
        return matches == 26;
    }
};
