package com.blind75needcode.twopointers;

import java.util.*;

/*
* https://neetcode.io/problems/three-integer-sum
* 3Sum
Solved
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.

The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]

Output: [[-1,-1,2],[-1,0,1]]
* */
public class ThreeSum {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println((threeSum(nums)));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // first sort the array
        //Declare an array of array
        // make this set so that there are no duplicates
        // fix the ith element
        // once you fix the one element then remaining array can be done like Two Sum
        // start left pointer from i+1
        // start right pointer from end
        // this will be a while loop until left crosses over right

        Arrays.sort(nums);
        Set<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    //found
                    //put all 3 in array
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    //put in final output
                    output.add(list);


                    //move pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    //sum is small so increase left
                    left++;
                } else{
                    //sum is large so decrease right
                    right--;
                }
            }
        }

        return new ArrayList<>(output);
    }
}
