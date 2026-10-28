class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        std::unordered_map<int,int> hMap;

        for(int i = 0; i < numbers.size(); i++) {
            hMap[numbers[i]] = i + 1;
        }

        for (int j = 0; numbers.size(); j++) {
            int diff = target - numbers[j];

            if (hMap.contains(diff)) {
                int firstIndex = hMap.at(diff);
                return vector<int> {j + 1,firstIndex};
            }
        }

        return vector<int> {};


    }
};
