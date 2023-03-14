import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.kataNumerosRomanos.Conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversor {
    @ParameterizedTest
    @CsvSource({ "1,I", "2,II", "3,III", "4,IV", "5,V", "6,VI", "7,VII", "8,VIII", "9,IX" })
    void convert_units_to_Roman_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Conversor().convert(input));
    }
    @ParameterizedTest
    @CsvSource({ "10,X", "20,XX", "30,XXX", "40,XL", "50,L", "60,LX", "70,LXX", "80,LXXX", "90,XC" })
    void convert_tens_to_Roman_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Conversor().convert(input));
    }
}
