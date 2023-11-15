#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        unordered_map<int, int> hm;

        for (int i = 0; i < nums.size(); ++i) {
            if (hm.find(target - nums[i]) != hm.end()) {
                result.push_back(hm.at(target - nums[i]));
                result.push_back(i);
            }
            hm[nums[i]] = i;
        }

        return result;
    }
};