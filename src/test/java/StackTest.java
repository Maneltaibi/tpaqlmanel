import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test void pushPopTest() {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        assertEquals(20, s.pop());
        assertEquals(10, s.pop());
    }

    @Test void peekTest() {
        Stack s = new Stack();
        s.push(42);
        assertEquals(42, s.peek());
        assertFalse(s.isEmpty());
    }

    @Test void isEmptyInitially() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
    }

    @Test void sizeAfterPush() {
        Stack s = new Stack();
        s.push(1); s.push(2);
        assertEquals(2, s.size());
    }

    @Test void popEmptyThrows() {
        Stack s = new Stack();
        assertThrows(IllegalStateException.class, s::pop);
    }

    @Test void peekEmptyThrows() {
        Stack s = new Stack();
        assertThrows(IllegalStateException.class, s::peek);
    }

    @Test void expandArrayTest() {
        Stack s = new Stack();
        for (int i = 0; i < 20; i++) s.push(i);
        assertEquals(20, s.size());
        assertEquals(19, s.peek());
    }
}
