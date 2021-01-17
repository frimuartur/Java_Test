import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenNumbersTest {

    @Test
    void oddCount() {
        assertEquals(7, evenNumbers.oddCount(15));
        assertEquals(10, evenNumbers.oddCount(20));
    }
}