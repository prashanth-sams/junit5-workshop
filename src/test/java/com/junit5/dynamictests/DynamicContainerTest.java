package com.junit5.dynamictests;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicContainerTest {

    ReverseString reverseString = new ReverseString();

    @TestFactory
    public Stream<DynamicNode> dynamicTestsWithDynamicContainers() {
        return createInputList().stream()
                .map(input ->
                        dynamicContainer("Container for " + input, Stream.of(
                            dynamicTest("not null", () -> assertNotNull(input)),
                            dynamicContainer("Properties for " + input, Stream.of(
                                    dynamicTest("length > 0", () -> assertTrue(input.length() > 0)),
                                    dynamicTest("not empty", () -> assertFalse(input.isEmpty()))
                            ))
                        ))
                );
    }

    private List<String> createInputList() {
        return Arrays.asList("car", "bike", "cycle");
    }
}
