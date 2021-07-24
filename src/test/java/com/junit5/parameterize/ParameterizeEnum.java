/**
 *
 * Parameterization with ValueSource
 * Author - Prashanth Sams
 *
 * shortcut for System.out.println("value = " + value); - soutp
 **/

package com.junit5.parameterize;

import com.junit5.parameterize.sub.Animals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.EnumSource.Mode.*;

public class ParameterizeEnum {

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @EnumSource(value = Animals.class)
    void firstMethod(Animals animals) {
        assertNotNull(animals);
    }

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @EnumSource(value = Animals.class, names = {"LION", "TIGER"})
    void secondMethod(Animals animals) {
        assertNotNull(animals);
    }

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @EnumSource(value = Animals.class, mode = EXCLUDE, names = {"ZEBRA", "CAT"})
    void thirdMethod(Animals animals) {
        assertNotNull(animals);
    }

    @ParameterizedTest(name = "Index: {index} - value: {arguments}")
    @EnumSource(value = Animals.class, mode = MATCH_ALL, names = "^(C|L).+$")
    void fourthMethod(Animals animals) {
        assertNotNull(animals);
    }

}
