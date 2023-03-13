import org.junit.jupiter.api.Test;
import org.kataNumerosRomanos.Conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversor {
    @Test
    void convert_1_to_I(){
        assertEquals("I", new Conversor().convert(1));
    }

    @Test
    void convert_2_to_II(){
        assertEquals("II", new Conversor().convert(2));
    }

    @Test
    void convert_3_to_III(){
        assertEquals("III", new Conversor().convert(3));
    }
}
