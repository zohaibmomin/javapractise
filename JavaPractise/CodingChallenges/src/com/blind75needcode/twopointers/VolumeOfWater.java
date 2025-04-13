package com.blind75needcode.twopointers;

public class VolumeOfWater {
    public static void main(String[] args) {
        int[] height = {1, 7, 2, 5, 4, 7, 3, 6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] heights) {

        //for maximum volume of water
        // we need x max and y max

        int left = 0;
        int right = heights.length - 1;

        int volMax = 0;
        while (left < right) {
            // formula for water volume
            // width x height
            // (right - left) x min(height[left],height[right])

            //min height because here the amount of water depends on the minimum height

            int area = (right - left) * Math.min(heights[left], heights[right]);

            if (area > volMax) {
                volMax = area;
            }

            //Always left or right pointer movement is conditional
            // here left moves if left height is small so increase left
            // right moves if right height is big so reduce right
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }

        }
        return volMax;

    }
}
