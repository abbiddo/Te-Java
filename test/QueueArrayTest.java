import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueArrayTest {

    @Test
    void push() {
        QueueArray queue = new QueueArray(3);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        queue.print();
        // 10 - 20 - 30 -

    }

    @Test
    void pop() {
        QueueArray queue = new QueueArray(3);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        queue.pop();

        queue.print();
        // 20 - 30 -

    }
}