import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;
public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList input1 = new LinkedList();
        input1.prepend(5);

        assertEquals(input1.root.value, 5);

        input1.prepend(10);

        assertEquals(input1.root.value, 10);
        assertEquals(input1.root.next.value, 5);
    }

    @Test
    public void testAppend() {
        LinkedList input1 = new LinkedList();

        input1.append(10);
        input1.append(24);
        input1.append(23);

        assertEquals(input1.root.value, 10);
        assertEquals(input1.root.next.value, 24);
        assertEquals(input1.root.next.next.value, 23);
    }

    @Test
    public void testLast() {
        LinkedList input1 = new LinkedList();

        boolean exception = false;

        try {
            input1.last();
        } catch (NoSuchElementException e) {
            exception = true;
        }

        assertTrue(exception);

        input1.append(7);

        assertEquals(7, input1.last());

        input1.append(16);

        assertEquals(16, input1.last());
    }

    @Test
    public void testToString() {
        LinkedList input1 = new LinkedList();
        assertEquals("", input1.toString());
        input1.append(5);
        assertEquals("5 ", input1.toString());
        input1.append(1239);
        assertEquals("5 1239 ", input1.toString());
    }

    @Test
    public void testLength() {
        LinkedList input1 = new LinkedList();
        assertEquals(0, input1.length());
        input1.append(5);
        assertEquals(1, input1.length());
        input1.append(1239);
        assertEquals(2, input1.length());
    }
}
