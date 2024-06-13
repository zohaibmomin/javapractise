package com.easy;
//problem - https://www.algoexpert.io/questions/longest-peak
public class LongPeak {
    public static void main(String[] args) {
        int[] array = {1,1,3,2,1}; // take testcases values

        int longestPeakLength = 0; //set longestPeak
        int i = 1;
        //start from 2nd element and go till end
        while(i < array.length -1) {
            int left = array[i-1];
            int right = array[i+1];
            int ele = array[i];
            if(left < ele && ele > right){
                //if peak found i.e left<center>right
                int leftIdx = i-2;
                while(leftIdx >= 0 && array[leftIdx] < array[leftIdx+1]){
                    //find leftmost decline
                    leftIdx--;
                }
                int rightIdx = i + 2;
                while(rightIdx < array.length && array[rightIdx-1] > array[rightIdx]){
                    //find rightmost decline
                    rightIdx++;
                }

                int currentPeakLength = rightIdx - leftIdx - 1;
                if(currentPeakLength > longestPeakLength){
                    longestPeakLength = currentPeakLength;
                }
                i=rightIdx;
            }else{
                i++;
            }
        }

        System.out.println(longestPeakLength);


    }
}
