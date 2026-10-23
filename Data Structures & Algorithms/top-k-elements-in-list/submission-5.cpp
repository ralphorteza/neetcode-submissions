class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> map;
        vector<pair<int, int>> arr;

        for(int num: nums) {
            if (!map.contains(num)) {
                map[num];
            }
            map[num]++;
        }

        for(const auto& p: map) {
            arr.push_back({p.second, p.first});
        }
        sort(arr.rbegin(), arr.rend());

        vector<int> out;
        for(int i = 0; i < k; i++) {
            out.push_back(arr[i].second);
        }
        return out;
    }
};
