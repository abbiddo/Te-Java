import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest {

    @Test
    void push() {

        StackArray stackArray = new StackArray(4);

        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);

        stackArray.push(5); // 아무것도 실행하지 않고 return

        stackArray.print();
        // 10 - 20 - 30 - 40 -

    }

    @Test
    void pop() {

        StackArray stackArray = new StackArray(4);

        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);

        stackArray.pop();
        stackArray.pop();

        stackArray.print();
        // 10 - 20 -

    }
}