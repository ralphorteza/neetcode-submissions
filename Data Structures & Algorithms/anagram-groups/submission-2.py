class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        grouped = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word not in grouped:
                grouped[sorted_word] = []
            
            grouped[sorted_word].append(word)

        res = []

        for key in grouped:
            res.append(grouped.get(key))

        return res
        