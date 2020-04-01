package ueb14.aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ueb14.aufgabe2.Stack;

public class StackTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();

        stack.push(1);
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopingOutOfBounds() {
        Stack stack = new Stack();
        try {
            stack.pop();
            fail("Erwarte Exception");
        } catch (IndexOutOfBoundsException e) {
            if (!e.getMessage().equals("Index -1 out of bounds for length 0")) {
                fail("Unerwartete Exception" + e.getMessage());
            }
        }
    }

    @Test
    public void testPopingOutOfBounds2() {
        Stack stack = new Stack();
        Throwable t = assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
        assertEquals("Index -1 out of bounds for length 0", t.getMessage());
    }
}
