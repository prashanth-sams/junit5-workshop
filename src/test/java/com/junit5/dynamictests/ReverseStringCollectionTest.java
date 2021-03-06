package com.junit5.dynamictests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class ReverseStringCollectionTest {

    ReverseString reverseString = new ReverseString();

    @TestFactory
    @DisplayName("Reverse String Collection Test")
    public Collection<DynamicTest> testReverseStringCollection() {

        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();

        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            String input = inputList.get(i);
            String output = outputList.get(i);

            DynamicTest dynamicTest = dynamicTest("Dynamic Test for reverse() method with input: " + input, () -> {
                assertEquals(output, reverseString.reverse(input));
            });

            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

    private List<String> createInputList() {
        return Arrays.asList("car", "bike", "cycle");
    }

    private List<String> createOutputList() {
        return Arrays.asList("rac", "ekib", "elcyc");
    }
}
