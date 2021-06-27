/**
 *
 * Custom Annotation
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import com.junit5.basic.tags.MyAnnotation;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomAnnotation {

    @BeforeAll
    void beforeAll() {
        System.out.println("-- before all --");
    }

    @MyAnnotation
    void firstMethod() throws InterruptedException {
        System.out.println("I am inside first method");
        Thread.sleep(3000);
    }

}
