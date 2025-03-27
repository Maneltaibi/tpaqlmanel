import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StackTest {
    @Test
    void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        Stack stack = new Stack();
        stack.push(30);
        assertEquals(30, stack.peek());
        assertEquals(30, stack.pop());
    }

    @Test
    void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
    }
}
