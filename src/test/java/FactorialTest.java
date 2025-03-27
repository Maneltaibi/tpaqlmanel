import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void testFactorialBaseCases() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void testFactorialValues() {
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
    }

    @Test
    void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}