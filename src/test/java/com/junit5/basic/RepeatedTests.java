/**
 *
 * Repeated Tests
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {

    @RepeatedTest(5)
    void firstMethod() {
        System.out.println("inside first method");
    }

    @RepeatedTest(value = 3, name = "Running repetition: {currentRepetition} out of {totalRepetitions}")
    void secondMethod() {
        System.out.println("inside second method");
    }

    @RepeatedTest(3)
    void thirdMethod(RepetitionInfo repetitionInfo) {
        assumingThat(repetitionInfo.getCurrentRepetition() == 2, () -> System.out.println("this code runs only for repetition 2"));
        System.out.println("this code will run on each repetition");
    }

}
