/**
 *
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println(""); - sout
 **/

package com.dumbs.basic;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Generic {

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

}
