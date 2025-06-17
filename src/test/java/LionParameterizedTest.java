import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({"Самец,true", "Самка,false"})
    void testMane(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(expected, lion.doesHaveMane());
    }
}