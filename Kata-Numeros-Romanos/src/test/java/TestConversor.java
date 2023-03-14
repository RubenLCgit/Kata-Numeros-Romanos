import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.kataNumerosRomanos.Conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversor {
    @ParameterizedTest
    @CsvSource({ "1,I", "2,II", "3,III" })
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Conversor().convert(input));
    }
}
