package com.practise.challengeLambdaFilterReduce;

import java.util.Arrays;
import java.util.List;

public class PrintStreamStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Delhi","Mumbai","Calcutta");

        strings.stream().forEach(
                string-> System.out.printf("\n %s",string)
        );
    }
}
