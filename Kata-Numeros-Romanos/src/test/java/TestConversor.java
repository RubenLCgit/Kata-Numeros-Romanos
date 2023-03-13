import org.junit.jupiter.api.Test;
import org.kataNumerosRomanos.Conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversor {
    @Test
    void convert_1_to_I(){
        assertEquals("I", new Conversor().convert(1));
    }
}
