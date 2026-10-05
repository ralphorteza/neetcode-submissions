class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int,int> hashMap;

        
        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums[i];

            if (hashMap.contains(diff)) {
                return  {hashMap[diff],i};
            }

            hashMap[nums[i]] = i;     
        }


        return {0, 0};
    }
};
