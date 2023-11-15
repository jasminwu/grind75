#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int helper(vector<int>& nums, int l, int r, int target) {
        if (l > r) return -1;
        int m = (l + r) / 2;

        if (nums[m] == target) return m;
        if (nums[m] > target) return helper(nums, l, m - 1, target);
        return helper(nums, m + 1, r, target);
    }
    int search(vector<int>& nums, int target) {
        return helper(nums, 0, nums.size() - 1, target);
    }
};