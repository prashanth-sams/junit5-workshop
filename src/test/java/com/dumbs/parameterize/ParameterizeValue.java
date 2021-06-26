/**
 *
 * Parameterization with ValueSource
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println("value = " + value); - soutp
 **/

package com.dumbs.parameterize;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizeValue {

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void firstMethod(int value) {
        System.out.println("value = " + value);
    }

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @NullSource
    @EmptySource
    @ValueSource(strings = {"car", "bike", "ship", "jet"})
    void secondMethod(String value) {
        System.out.println("value = " + value);
    }

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"A", "B", "C"})
    void thirdMethod(String value) {
        System.out.println("value = " + value);
    }

}
