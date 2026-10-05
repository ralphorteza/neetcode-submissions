class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {

        std::unordered_map<int, int> mappy;

        for (int i = 0; i < nums.size(); i++) {
            if (mappy.contains(nums[i])) {
                return true;
            }
            mappy[nums[i]]++;
        }

        return false;
    }
};