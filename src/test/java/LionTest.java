import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    void shouldThrowExceptionIfInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестный", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    void lionReturnsCorrectKittensFromFeline() throws Exception {
        when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", feline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    void lionReturnsCorrectFoodFromFeline() throws Exception {
        List<String> food = List.of("Мясо", "Курица");
        when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самка", feline);
        assertEquals(food, lion.getFood());
    }
}