package w4;

/**
 * 53. Maximum Subarray
 *
 * Approach: The catch is we have both positive and negative numbers in the
 * array.
 *
 * We have 2 cases for each element in the array, nums[i]
 *
 * 1) nums[i] is positive, then we can add it to the currentSum
 * 2) nums[i] is negative. In this case, we have 2 sub-cases
 *
 * Either we can add it to the currentSum, or we can start a new subarray from
 * nums[i]
 *
 * The main point of this question is realising that we can use a greedy
 * approach here, and choose the maximum of the above 2
 * cases.
 *
 * We then update the maxSum with the currentSum if needed.
 *
 *
 */
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
