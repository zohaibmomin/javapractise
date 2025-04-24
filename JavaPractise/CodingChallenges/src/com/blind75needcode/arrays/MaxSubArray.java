package com.blind75needcode.arrays;

public class MaxSubArray {
    public static void main(String[] args) {

//        int[] nums = {2, -3, 4, -2, 2, 1, -1, 4};
        int[] nums={-2,1};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}



