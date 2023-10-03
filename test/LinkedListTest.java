import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void add() {

        LinkedList list = new LinkedList();
        ListNode head = new ListNode(10);

        head = list.add(head, new ListNode(20), -1);
        head = list.add(head, new ListNode(30), 5);
        head = list.add(head, new ListNode(40), 1);

        list.print(head);
        // 20 - 40 - 10 - 30 -

    }

    @Test
    void remove() {

        LinkedList list = new LinkedList();
        ListNode head = new ListNode(10);

        head = list.add(head, new ListNode(20), -1);
        head = list.add(head, new ListNode(30), 5);
        head = list.add(head, new ListNode(40), 1);

        // 20 - 40 - 10 - 30 -

        head = list.remove(head, 2);
        head = list.remove(head, 6);
        head = list.remove(head, -1);

        list.print(head);
        // 20 - 40 - 30 -

    }

    @Test
    void contains() {

        LinkedList list = new LinkedList();
        ListNode head = new ListNode(10);

        head = list.add(head, new ListNode(20), -1);
        head = list.add(head, new ListNode(30), 5);
        head = list.add(head, new ListNode(40), 1);

        System.out.println(list.contains(head, new ListNode(10)));  // True
        System.out.println(list.contains(head, new ListNode(100))); // False

    }
}