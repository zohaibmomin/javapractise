package com.medium;

import java.util.Arrays;
import java.util.List;

//Function that returns smallest absolute difference of pair from two list
//https://www.algoexpert.io/questions/smallest-difference

public class Absolutedifference {
    public static void main(String[] args) {

        int[] array1 = {-1,5,10,20,28,3};
        int[] array2 = {26,134,135,15,17};

        int[] result = smallestDifference(array1, array2);
        System.out.printf("Smallest Difference %s",Arrays.toString(result));
    }
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        //declare two pointers to move in both arrays
        int pointer1 = 0;
        int pointer2 = 0;

        //assume smallest and current for reference
        //finally if current < smallest then current becomes smallest
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;

        //the pair of num1 and num2 with the smallest Difference
        int[] smallestArr = new int[2];
        while (pointer1 < arrayOne.length && pointer2 < arrayTwo.length){
            int firstNum = arrayOne[pointer1];
            int secondNum = arrayTwo[pointer2];

            if(firstNum < secondNum){
                current = secondNum - firstNum; // potential difference that may be smallest
                pointer1++; //move the pointer to right of firstNum arrayOne
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                pointer2++; // move the pointer to right of secondNum arrayTwo
            }else{
                return  new int[]{firstNum, secondNum};
            }
            if(current < smallest){
                smallest = current;
                smallestArr = new int[]{firstNum, secondNum};
            }
        }
        return smallestArr;
    }
}
