import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PrimeTest {
    @Test
    void testPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(10));
    }

    @Test
    void testNegativeNumbers() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(-10));
    }
}