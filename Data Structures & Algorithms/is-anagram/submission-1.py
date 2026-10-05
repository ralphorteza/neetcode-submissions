class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_count = {}

        for c in s:
            if c not in char_count:
                char_count[c] = 0
            char_count[c] += 1

        for ch in t:
            if ch not in char_count:
                return False
            char_count[ch] -= 1

        for c in char_count:
            if char_count[c] != 0:
                return False

        return True
        