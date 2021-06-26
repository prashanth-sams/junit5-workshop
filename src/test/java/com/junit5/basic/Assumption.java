/**
 *
 * Assumptions
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.*;

public class Assumption {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void firstMethod(int param) {
        assumeTrue(param < 5);
    }

    @ParameterizedTest
    @ValueSource(strings = {"cat", "dog"})
    void secondMethod(String value) {
        assumeFalse(value.equals("cat"), "Assumption failed for the string: " + value);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void thirdMethod(int value) {
        assumingThat(value > 4, () -> System.out.println("value greater that 4"));
        System.out.println("value = " + value);
    }

}
