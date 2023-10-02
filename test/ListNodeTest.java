import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void add() {

        ListNode list = new ListNode(10);

        list = list.add(list, new ListNode(20), -1);
        list = list.add(list, new ListNode(30), 5);
        list = list.add(list, new ListNode(40), 1);

        list.print(list);
        // 20 - 40 - 10 - 30 -

    }

    @Test
    void remove() {

        ListNode list = new ListNode(10);

        list = list.add(list, new ListNode(20), -1);
        list = list.add(list, new ListNode(30), 5);
        list = list.add(list, new ListNode(40), 1);

        // 20 - 40 - 10 - 30 -

        list = list.remove(list, 2);
        list = list.remove(list, 6);
        list = list.remove(list, -1);

        list.print(list);
        // 40 - 30 -
    }

    @Test
    void contains() {

        ListNode list = new ListNode(10);

        System.out.println(list.contains(list, new ListNode(10)));
        System.out.println(list.contains(list, new ListNode(100)));
    }
}