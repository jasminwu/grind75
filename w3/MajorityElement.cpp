#include "bits/stdc++.h"
using namespace std;

class Solution {
public:
    int majorityElement(const std::vector<int>& nums) {
        std::unordered_map<int, int> frequency;

        for (int num : nums) {
            frequency[num]++;
        }

        auto maxElement = std::max_element(
            frequency.begin(), frequency.end(),
            [](const auto& a, const auto& b) { return a.second < b.second; });

        return maxElement->first;
    }
};