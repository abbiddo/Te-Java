import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackListNodeTest {

    @Test
    void push() {
        StackListNode stack = new StackListNode();

        stack.push(10);
        stack.push(20);

        stack.print();
        // 10 - 20 -

    }

    @Test
    void pop() {
        StackListNode stack = new StackListNode();

        stack.push(10);
        stack.push(20);

        assertEquals(stack.pop(), 20);

        stack.print();
        // 10 -
        
    }
}