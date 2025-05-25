import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testGetFullName() {
        Person person = new Person("John", "Doe", 25);
        assertEquals("John Doe", person.getFullName());
    }

    @Test void fullNameEmptyTest() {
        assertEquals(" ", new Person("", "", 20).getFullName());
    }

    @Test void isAdultBoundary18() {
        assertTrue(new Person("Test", "A", 18).isAdult());
    }

    @Test
    void testIsAdult() {
        Person adult = new Person("Alice", "Smith", 20);
        Person minor = new Person("Bob", "Brown", 17);

        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }
}