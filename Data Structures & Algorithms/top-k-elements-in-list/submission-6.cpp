class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        std::unordered_map<int,int> hash;
        vector<pair<int,int>> arr;
        vector<int> result;

        for (int num: nums) {
            hash[num]++;
        }

        for (const auto& [key,value]: hash) {
            arr.push_back({value, key});
        }
        sort(arr.rbegin(), arr.rend());

        for (int i = 0; i < k; i++) {
            result.push_back(arr[i].second);
        }

        return result;




    }
};
