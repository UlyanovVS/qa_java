package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void getKittenWithArgumentReturnsValue(int kittens) {
        Feline feline = new Feline();
        assertEquals(kittens, feline.getKittens(kittens));
    }
}