import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineTest {
    Feline feline = new Feline();

    @Test
    void eatMeatReturnsList() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    void getKittensReturnsOneByDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getFamilyReturnsCorrectValue() {
        assertEquals("Кошачьи", feline.getFamily());
    }
}