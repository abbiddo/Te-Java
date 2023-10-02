public class ListNode {

    private ListNode next;  // 다음 노드
    private int value;  // 저장된 값

    public ListNode(int value){
        this.value = value;
    }

    public void setNext(ListNode node){
        this.next = node;
    }

    public int getValue(){
        return this.value;
    }

    public ListNode getNext(){
        return this.next;
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position){

        if (position <= 0 || head == null){
            nodeToAdd.setNext(head);
            head = nodeToAdd;

            return head;
        }

        ListNode cur = head;
        int idx = 0;

        while(idx < position - 1 && cur.getNext() != null){
            idx++;
            cur = cur.getNext();
        }

        if (cur.getNext() == null){
            cur.setNext(nodeToAdd);
        } else{
            nodeToAdd.setNext(cur.getNext());
            cur.setNext(nodeToAdd);
        }

        return head;
    }

    ListNode remove(ListNode head, int positionToRemove){

        if (head == null || positionToRemove < 0){
            return head;
        }

        if (positionToRemove == 0){
            head = head.getNext();
            return head;
        }

        ListNode cur = head;
        int idx = 0;

        while(idx < positionToRemove - 1 && cur.getNext() != null){
            cur = cur.getNext();
            idx++;
        }

        if (cur.getNext() != null){
            cur.setNext(cur.getNext().getNext());
        }

        return head;
    }

    boolean contains(ListNode head, ListNode nodeTocheck){
        ListNode cur = head;

        while(cur != null){
            if (cur.getValue() == nodeTocheck.getValue()){
                return true;
            }
            cur = cur.getNext();
        }

        return false;
    }

    void print(ListNode head){
        ListNode cur = head;

        while(cur != null){
            System.out.print(cur.getValue() + " - ");
            cur = cur.getNext();
        }
    }
}