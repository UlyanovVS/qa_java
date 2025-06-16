package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LionAlexParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void testDoesHaveManeForLionAlex(String sex, boolean expected) throws Exception {
        class LionAlexTestable extends Lion {
            public LionAlexTestable(String sex, Predator predator) throws Exception {
                super(sex, predator);
            }
        }

        Predator predator = new Feline();

        LionAlexTestable lionAlex = new LionAlexTestable(sex, predator);
        assertEquals(expected, lionAlex.doesHaveMane());
    }
}