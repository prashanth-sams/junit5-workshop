/**
 *
 * Hamcrest
 * Author - Prashanth Sams
 *
 **/

package com.junit5.assertion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Hamcrest {

    @Test
    void firstMethod() {
        Map<String, Integer> vehicle = new HashMap<>();
        vehicle.put("car", 10000);
        vehicle.put("bike", 8000);
        vehicle.put("cycle", 5000);

        assertThat(vehicle, hasKey("car"));
        assertThat(vehicle, hasValue(10000));
    }

    @Test
    void secondMethod() {
        List<String> vehicle = Arrays.asList("car", "bike", "cycle");
        assertThat(vehicle, hasItem("car"));
        assertThat(vehicle, anyOf(hasItem("car"), hasItem("xyz")));
        assertThat(vehicle, allOf(hasItem("car"), hasItem("bike")));
        assertThat(vehicle, containsInAnyOrder("bike", "car", "cycle"));
        assertThat(vehicle, containsInRelativeOrder("car", "bike", "cycle"));
    }

}
