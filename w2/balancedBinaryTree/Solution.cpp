/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    int findHeight(TreeNode* current) {
        if (current == NULL) return 0;
        return max(findHeight(current->left), findHeight(current->right)) + 1;
    }
    bool isBalanced(TreeNode* root) {
        if (root == NULL || (root->left == NULL && root->right == NULL))
            return true;
        if (abs(findHeight(root->left) - findHeight(root->right)) > 1)
            return false;
        return isBalanced(root->left) && isBalanced(root->right);
    }
};