/**
 * Disable Tests
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisableTests {

    @Test
    @Disabled(value = "Disabled for demo purpose")
    void firstMethod() {
        System.out.println("this is the first method");
    }

    @Test
    @DisabledOnOs(value = OS.MAC, disabledReason = "this test is disabled on MAC machine")
    void secondMethod() {
        System.out.println("this is the second method");
    }

    @Test
    @EnabledOnOs(value = OS.WINDOWS, disabledReason = "this test is enabled only on Windows machine")
    void thirdMethod() {
        System.out.println("this is the third method");
    }

    boolean provider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "disabled with condition")
    void fourthMethod() {
        System.out.println(provider());
        System.out.println("this is the fourth method");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "env", matches = "staging")
    void fifthMethod() {
        System.out.println("this is the fifth method");
    }

}
