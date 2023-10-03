public class ListNode {

    private ListNode next;  // 다음 노드
    private int value;  // 저장된 값

    // 생성자
    public ListNode(int value) {
        this.value = value;
    }

    // setter
    public void setNext(ListNode node) {
        this.next = node;
    }

    // getter
    public int getValue() {
        return this.value;
    }

    public ListNode getNext() {
        return this.next;
    }

}

