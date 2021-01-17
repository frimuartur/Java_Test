import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Native;

import static org.junit.jupiter.api.Assertions.*;
class MathTest {

    @Test
    public void testSetArray(){
        Math math = new Math();
        int [] arr = math.setArray(4,5,6,8,10,0);
        int [] expected = {4,5,6,8,10,0};
        assertArrayEquals(arr,expected);
    }


    @Nested
    @DisplayName("Mathematics operations")
    class simpleOperation{
        @Test
        @DisplayName("Functia pentru impartire")
        public void testDivide (){
            Math math = new Math();
            assertEquals(5, math.divide(10,2), "Adunarea nu lucreaza");
            assertThrows(ArithmeticException.class, () -> math.divide(5,0));
        }
        @Test
        void sum() {
            Math math = new Math();
            assertEquals(12, math.sum(7,5), "Adunarea nu lucreaza");
            //int res = math.sum(5,7);
            //assert res == 12 : "Adunarea nu lucreaza cum trebuie"
        }
    }
}