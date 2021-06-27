/**
 *
 * Assertion
 * Author - Prashanth Sams
 *
 **/

package com.junit5.assertion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Assert {

    @Test
    void firstMethod() {
        assertEquals("Cat", "Cat");
        assertEquals("Cat", "Cat", "Expected Cat and Actual Cat");
    }

    @Test
    void secondMethod() {
        List<String> expectedValues = Arrays.asList("cat", "dog");
        List<String> actualValues = Arrays.asList("cat", "dog");

        assertEquals(expectedValues, actualValues, "lists not matching");
//        assertNotEquals(expectedValues, actualValues, "lists not matching");
    }

    @Test
    void thirdMethod() {
        int[] expectedValues = {1, 3, 5};
        int[] actualValues = {1, 3, 5};

        assertArrayEquals(expectedValues, actualValues, "lists not matching");
    }

    @Test
    void fourthMethod() {
        assertTrue(true, "this boolean needs to be true");
        assertFalse(false, "this boolean needs to be false");
    }

    @Test
    void fifthMethod() {
        assertThrows(NullPointerException.class, null);
    }

    @Test
    void sixthMethod() {
        assertAll(
                () -> assertThrows(NullPointerException.class, null),
                () -> assertTrue(true, "this boolean needs to be true"),
                () -> assertFalse(false, "this boolean needs to be false")
        );
    }

}
