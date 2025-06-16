package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Predator predator;

    @Test
    void shouldHaveManeIfMale() throws Exception {
        Lion lion = new Lion("Самец", predator);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void shouldNotHaveManeIfFemale() throws Exception {
        Lion lion = new Lion("Самка", predator);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void shouldThrowExceptionIfInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Нейтральный", predator));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    void getKittensReturnsPredatorValue() throws Exception {
        when(predator.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", predator);
        assertEquals(3, lion.getKittens());
    }

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> food = Arrays.asList("Мясо", "Птица");
        when(predator.eatMeat()).thenReturn(food);
        Lion lion = new Lion("Самка", predator);
        assertEquals(food, lion.getFood());
    }
}