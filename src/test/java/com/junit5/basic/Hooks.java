/**
 *
 * Lifecycle Methods / Hooks
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Hooks {

    @BeforeAll
    void beforeAll() {
        System.out.println("-- before all --");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("-- before each --");
    }

    @Test
    @DisplayName("TC1 - First Method")
    void firstMethod() {
        System.out.println("inside first method");
    }

    @Test
    @DisplayName("TC2 - Second Method")
    void secondMethod() {
        System.out.println("inside second method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("-- after each --");
    }

    @AfterAll
    void afterAll() {
        System.out.println("-- after all --");
    }

}
