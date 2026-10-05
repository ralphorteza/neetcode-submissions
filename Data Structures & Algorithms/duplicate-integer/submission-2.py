class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        occurrance = {}

        for num in nums:
            if num not in occurrance:
                occurrance[num] = 0

            occurrance[num] += 1

            if occurrance[num] > 1:
                return True
        # print(occurrance)
        return False

        