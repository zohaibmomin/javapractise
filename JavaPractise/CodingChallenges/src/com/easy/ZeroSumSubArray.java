package com.easy;

import java.util.HashSet;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        boolean ans = zeroSumSubArray(array);
        System.out.printf("Answer is :: %s , ", ans);
    }

    public static boolean zeroSumSubArray(int[] nums) {
        HashSet<Integer> sums = new HashSet<Integer>();
        int currentSum = 0;
        sums.add(currentSum);
        for (int num : nums) {
            currentSum += num;
            if (sums.contains(currentSum)) {
                return true;
            }
            sums.add(currentSum);
        }
        return false;
    }
}
