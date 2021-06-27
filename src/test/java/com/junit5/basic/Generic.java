/**
 *
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println(""); - sout
 * mvn test -Dtestpackage=com.junit5
 * mvn test -Dtest=com.junit5.basic.Generic
 * mvn test -Dtest=Generic
 **/

package com.junit5.basic;

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
