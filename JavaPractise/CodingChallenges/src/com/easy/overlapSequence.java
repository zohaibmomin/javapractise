package com.easy;

import java.util.ArrayList;
import java.util.List;

//find overlap between two sorted 1-D sequences.
public class overlapSequence {
    public static void main(String[] args) {
        int[] seq1 = {1, 2, 3, 4, 6};
        int[] seq2 = {3, 4, 5, 8, 9};

        List<Integer> output = findOverlap(seq1, seq2);
        System.out.printf("Output %s", output);
    }

    private static List<Integer> findOverlap(int[] seq1, int[] seq2) {
        List<Integer> overlap = new ArrayList<>();

        int i = 0, j = 0;

        while (i < seq1.length && j < seq2.length) {
            if (seq1[i] == seq2[j]) {
                overlap.add(seq1[i]);
                i++;
                j++;
            } else if (seq1[i] < seq2[j]) {
                i++;
            } else if (seq1[i] > seq2[j]) {
                j++;
            }
        }

        return overlap;

    }
}
