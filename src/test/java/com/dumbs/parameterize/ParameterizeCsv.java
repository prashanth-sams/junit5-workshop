/**
 *
 * Parameterization with CSVSource
 * Author - Prashanth Sams
 *
 **/

package com.dumbs.parameterize;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizeCsv {

    @ParameterizedTest
    @CsvSource(value = {"'Prashanth,Sams', 32, false", "Moses, 31, true", "'David Deon', 8, true"})
    void firstMethod(String param1, int param2, boolean param3) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"Prashanth?Sams", "Moses?Jerome", "David?Deon"}, delimiter = '?')
    void secondMethod(String param1, String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/list.csv", numLinesToSkip = 1)
    void thirdMethod(String param1, int param2, String param3, Double param4) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3 +
                ", param4 = " + param4);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/list3.csv", numLinesToSkip = 1, delimiter = '?')
    void fourthMethod(String param1, int param2, String param3, Double param4) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3 +
                ", param4 = " + param4);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/list4.csv", numLinesToSkip = 1, delimiterString = "__")
    void fifthMethod(String param1, int param2, String param3, Double param4) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3 +
                ", param4 = " + param4);
    }

}
