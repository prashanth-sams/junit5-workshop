package com.junit5.parameterize.sub;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

public class ParamProvider {

    static List<Arguments> subStreamArgumentValues() {
        return Arrays.asList(Arguments.arguments("Prashanth", 32), Arguments.arguments("Sams", 33));
    }

}
