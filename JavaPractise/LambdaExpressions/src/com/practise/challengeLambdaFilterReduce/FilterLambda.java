package com.practise.challengeLambdaFilterReduce;

import java.util.List;

public class FilterLambda {
    public static void main(String[] args) {
        List<String> stringList = List.of("ABCDHEUD","12345678910111213","MynameisZohaibMomin","hello");
        String str = stringList.stream()
                .filter((string)->string.length() > 10)
                .reduce("", (string1,string2)-> string1+" "+string2);
        System.out.printf("Final Result is %s",str);
    }
}
