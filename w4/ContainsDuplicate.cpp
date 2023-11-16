#include "bits/stdc++.h"
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int, int> hm;

        for (int i = 0; i < nums.size(); ++i) {
            if (hm.find(nums[i]) != hm.end()) {
                return true;
            }
            hm[nums[i]] = i;
        }

        return false;
    }
};