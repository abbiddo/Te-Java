import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListHeadTest {

    @Test
    void add() {

        LinkedListHead list = new LinkedListHead();

        list.add(new ListNode(10), 0);
        list.add(new ListNode(20), 0);
        list.add(new ListNode(30), 0);

        list.print();
        // 30 - 20 - 10 -

    }

    @Test
    void remove() {

        LinkedListHead list = new LinkedListHead();

        list.add(new ListNode(10), 0);
        list.add(new ListNode(20), 0);
        list.add(new ListNode(30), 0);

        list.remove(1);

        list.print();
        // 30 - 10 -

    }

    @Test
    void contains() {
        LinkedListHead list = new LinkedListHead();

        list.add(new ListNode(10), 0);
        list.add(new ListNode(20), 0);
        list.add(new ListNode(30), 0);

        System.out.println(list.contains(new ListNode(10)));    // true
        System.out.println(list.contains(new ListNode(100)));   // false

    }
}