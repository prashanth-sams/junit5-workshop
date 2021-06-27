/**
 *
 * Nested Tests
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


public class NestedTests {

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class InnerNestedTests {

        @BeforeAll
        void beforeAll() {
            System.out.println("-- before all --");
        }

        @Test
        void nestedMethod() {
            System.out.println("I am inside the method of the nested class");
        }

    }

}
