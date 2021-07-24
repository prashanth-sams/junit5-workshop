package com.junit5.dynamictests;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @TestFactory
    @DisplayName("Reverse Test")
    public DynamicTest testReverse() {
        return dynamicTest("Dynamic Test for reverse method", () -> {
           assertEquals("gnirts a si siht", reverseString.reverse("this is a string"));
        });
    }
}
