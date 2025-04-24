package com.blind75needcode.arrays;

public class MaxSubArray {
    public static void main(String[] args) {

//        int[] nums = {2, -3, 4, -2, 2, 1, -1, 4};
        int[] nums={-2,1};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int left = 0;
        int right = 1;

        int maxSum = nums[left];
        while (right < nums.length) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum = sum + nums[i];
            }
            maxSum = Math.max(sum, maxSum);
            //increase the window
            if (right == nums.length-1) {
                left++;
                right = left + 1;
            } else {
                right++;
            }
        }
        maxSum = Math.max(maxSum, nums[nums.length - 1]);

        return maxSum;
    }
}



