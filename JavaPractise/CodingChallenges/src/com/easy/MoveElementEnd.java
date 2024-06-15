package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//problem - https://www.algoexpert.io/questions/move-element-to-end
public class MoveElementEnd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 1, 2, 2, 2, 3, 4, 2);
        System.out.println("Original List");
        numbers.forEach(num->System.out.printf(" %s",num));

        System.out.println("\nBubbled List");
        moveElementToEnd(numbers, 2).stream().forEach(num->System.out.printf(" %s",num));

    }
    // 2 1 2 2 2 3 4 2
    // 4 1i 2 2 2 3 2j 2
    // 4 1 3i 2 2 2j 2 2

    public static List<Integer> moveElementToEnd(List<Integer> numbers, int toMove) {
        ArrayList<Integer> array = new ArrayList<>(numbers);
        int behindPtrIdx=array.size()-1;
        for (int i = 0; i < array.size(); i++) {
            int element = array.get(i);
            if(toMove == element){
                while(behindPtrIdx > i){
                    if(array.get(behindPtrIdx) != toMove){
                        Collections.swap(array,behindPtrIdx,i);
                        break;
                    }else{
                        behindPtrIdx--;
                    }
                }
            }
        }

        return array;
    }
}
