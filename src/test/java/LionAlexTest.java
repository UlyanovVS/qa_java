import com.example.Feline;
import com.example.LionAlex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LionAlexTest {

    Feline feline = new Feline();

    @Test
    void lionAlexHasNoKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    void lionAlexHasCorrectFriends() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    void lionAlexLivesInCorrectPlace() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}