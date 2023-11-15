#include "bits/stdc++.h"
using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> charCount;

        for (char c : s) {
            charCount[c]++;
        }

        int result = 0;

        for (const auto& [key, value] : charCount) {
            result += value - (value % 2);
        }

        return min(static_cast<int>(s.length()),
                   result + (result < s.length()));
    }
};
