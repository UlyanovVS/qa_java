package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    void catSayMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void catGetFoodFromFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }
}