package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatParameterizedTest {
    @ParameterizedTest
    @ValueSource(strings = {"Мяу"})
    void soundAlwaysMeow(String expectedSound) {
        Cat cat = new Cat(new Feline());
        assertEquals(expectedSound, cat.getSound());
    }
}