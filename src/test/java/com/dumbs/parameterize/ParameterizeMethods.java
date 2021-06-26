/**
 *
 * Parameterization with MethodSource
 * Author - Prashanth Sams
 *
 **/

package com.dumbs.parameterize;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizeMethods {

    List<String> listValues() {
        return Arrays.asList("Prashanth", "Sams", "James");
    }

    @ParameterizedTest
    @MethodSource(value = "listValues")
    void firstMethod(String value) {
        System.out.println("value = " + value);
    }

    Stream<String> streamValues() {
        return Stream.of("Prashanth", "Sams", "James");
    }

    @ParameterizedTest
    @MethodSource(value = "streamValues")
    void secondMethod(String value) {
        System.out.println("value = " + value);
    }

    List<Arguments> argumentValues() {
        return Arrays.asList(Arguments.arguments("Prashanth", 32), Arguments.arguments("Sams", 31));
    }

    @ParameterizedTest
    @MethodSource(value = "argumentValues")
    void thirdMethod(String param1, int param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }



}
