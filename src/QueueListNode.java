public class QueueListNode {

    private ListNode head;

    void push(int data){

        ListNode add = new ListNode(data);

        if (head == null){
            head = add;
            return;
        }

        ListNode cur = head;
        while (cur.getNext() != null){
            cur = cur.getNext();
        }

        cur.setNext(add);
    }

    int pop(){

        if (head == null) { return Integer.MIN_VALUE; }

        int data = head.getValue();
        head = head.getNext();

        return data;
    }

    void print(){
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.getValue() + " - ");
            cur = cur.getNext();
        }
    }

}
