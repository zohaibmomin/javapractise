package com.example.tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AseertionPlayground {

    @Test
    public void compareArray() {
        int[] actual = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareObjects() {
        String name = "Zohaib";
        String name2 = "Zohaib";

        Assertions.assertEquals(name2, name); // Test case passed
        Assertions.assertSame(name2, name, "Test case failed"); // Test case passed


        String nameStr = new String("Raj");
        String nameStr2 = new String("Raj");

        Assertions.assertEquals(nameStr2, nameStr); // Test case passed

        //Test case failed because reference is different of both Raj
        Assertions.assertSame(nameStr2, nameStr, "Test case failed"); // Test case failed
    }

    @Test
    public void compareIterables() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void checkException() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("this is runtime exceptions");
        });
    }
}
