/**
 *
 * Parameterization with MethodSource
 * Author - Prashanth Sams
 *
 **/

package com.junit5.parameterize;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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

    List<Arguments> argumentListValues() {
        return Arrays.asList(Arguments.arguments("Prashanth", 32), Arguments.arguments("Sams", 31));
    }

    @ParameterizedTest
    @MethodSource(value = "argumentListValues")
    void thirdMethod(String param1, int param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    Stream<Arguments> streamArgumentValues() {
        return Stream.of(Arguments.arguments("Prashanth", 32), Arguments.arguments("Sams", 31));
    }

    @ParameterizedTest
    @MethodSource(value = "streamArgumentValues")
    void fourthMethod(String param1, int param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @MethodSource(value = "com.junit5.parameterize.sub.ParamProvider#subStreamArgumentValues")
    void fifthMethod(String param1, int param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }


}
