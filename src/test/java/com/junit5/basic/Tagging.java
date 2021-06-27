/**
 *
 * Tag
 * Author - Prashanth Sams
 *
 * mvn test -Dgroups="smoke" -Dtest=com.junit5.basic.Tagging
 * mvn test -Dgroups="smoke|regression" -Dtest=com.junit5.basic.Tagging
 * mvn test -Dgroups="smoke&regression" -Dtest=com.junit5.basic.Tagging
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class Tagging {

    @Test
    @Tag("smoke")
    @DisplayName("TC1 - First Method")
    void firstMethod() {
        System.out.println("inside first method");
    }

    @Test
    @Tag("regression")
    @DisplayName("TC2 - Second Method")
    void secondMethod() {
        System.out.println("inside second method");
    }

    @Test
    @Tag("smoke")
    @Tag("regression")
    @Tag("sanity")
    @DisplayName("TC3 - Third Method")
    void thirdMethod() {
        System.out.println("inside third method");
    }

    @Test
    @Tags(value = {@Tag("smoke"), @Tag("sanity")})
    @DisplayName("TC4 - Fourth Method")
    void fourthMethod() {
        System.out.println("inside fourth method");
    }

}
