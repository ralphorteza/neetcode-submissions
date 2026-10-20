class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::unordered_map<int, int> seen;

        for (int num: nums) {
            seen[num]++;
            if (seen[num] > 1) {
                return true;
            }
        }
        
        return false;
    }
};