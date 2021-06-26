/**
 *
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println(""); - sout
 **/

package com.junit5.order;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DisplayNameOrder {

    @Test
    @DisplayName("TC2 - Second Method")
    void secondMethod() {
        System.out.println("inside second method");
    }

    @Test
    @DisplayName("TC1 - First Method")
    void firstMethod() {
        System.out.println("inside first method");
    }

}
