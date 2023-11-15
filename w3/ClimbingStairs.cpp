#include "bits/stdc++.h"
using namespace std;

class Solution {
public:
    int fib(int n, vector<int>& dp) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dp[n] != -1) {
            return dp[n];
        } else {
            dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
            return dp[n];
        }
    }
    int climbStairs(int n) {
        vector<int> dp(47, -1);

        return fib(n + 1, dp);
    }
};