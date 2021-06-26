/**
 *
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println(""); - sout
 **/

package com.junit5.order;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedAnnotation {


    @Test
    @DisplayName("TC1 - First Method")
    @Order(3)
    void firstMethod() {
        System.out.println("inside first method");
    }

    @Test
    @DisplayName("TC2 - Second Method")
    @Order(2)
    void secondMethod() {
        System.out.println("inside second method");
    }

    @Test
    @DisplayName("TC3 - Third Method")
    @Order(1)
    void thirdMethod() {
        System.out.println("inside third method");
    }

}
