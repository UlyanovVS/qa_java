package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LionAlexTest {

    Predator predator = new Feline();

    @Test
    void lionAlexHasNoKittens() throws Exception {
        LionAlex alex = new LionAlex(predator);
        assertEquals(0, alex.getKittens());
    }

    @Test
    void lionAlexHasCorrectFriends() throws Exception {
        LionAlex alex = new LionAlex(predator);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    void lionAlexLivesInCorrectPlace() throws Exception {
        LionAlex alex = new LionAlex(predator);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}