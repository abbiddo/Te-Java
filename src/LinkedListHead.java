public class LinkedListHead {

    private ListNode head;

    void add(ListNode nodeToAdd, int position) {
        if (head == null){
            head = nodeToAdd;
            return;
        }

        // 위치가 0보다 작거나 같으면 or head가 존재하지 않으면 맨 앞에 삽입
        if (position <= 0) {
            nodeToAdd.setNext(head);
            head = nodeToAdd;

            return;
        }

        // 시작점 초기화
        ListNode cur = head;
        int idx = 0;

        // 삽입하려는 위치 이전 노드를 찾음
        // cur.getNest()가 null이라면 링크드리스트의 마지막 노드
        while (idx < position - 1 && cur.getNext() != null) {
            idx++;
            cur = cur.getNext();
        }

        // cur이 마지막 노드인 경우 cur의 다음 노드를 삽입하는 노드로 자징
        if (cur.getNext() == null) {
            cur.setNext(nodeToAdd);
        } else { // cur이 중간 노드인 경우 cur의 다음 노드는 삽입하는 노드가 가리키고, cur은 삽입 노드를 가리킴
            nodeToAdd.setNext(cur.getNext());
            cur.setNext(nodeToAdd);
        }

    }

    void remove(int positionToRemove) {

        // head가 존재하지 않거나 삭제하는 인덱스의 범위가 음수라면 head 반환
        // head가 존재하지 않는 경우의 head 반환은 null 반환과 동일
        if (head == null || positionToRemove < 0) {
            return;
        }

        // 맨 앞 노도를 제거하는 경우 head를 제거하는 경우와 같음
        // head가 가리키던 노드를 head로 반환
        if (positionToRemove == 0) {
            head = head.getNext();
            return;
        }

        // 시작점 초기화
        ListNode cur = head;
        int idx = 0;

        // 삭제할 위치의 이전 노드를 찾음
        while (idx < positionToRemove - 1 && cur.getNext() != null) {
            cur = cur.getNext();
            idx++;
        }

        // cur의 다음 노드가 존재하는 경우 cur의 다음 노드는 다음 노드의 다음 노드
        if (cur.getNext() != null) {
            cur.setNext(cur.getNext().getNext());
        }
        // cur의 다음 노드가 존재하지 않는 경우 범위가 벗어난 노드를 제거하려는 것

    }

    boolean contains(ListNode nodeTocheck) {
        ListNode cur = head;

        // 마지막 노드까지 탐색
        while (cur != null) {
            // value가 같은 노드가 존재한다면 true 반환
            if (cur.getValue() == nodeTocheck.getValue()) {
                return true;
            }
            cur = cur.getNext();
        }

        // 끝까지 탐색했으나 찾지 못한 경우 false 반환
        return false;
    }

    void print() {
        ListNode cur = head;

        while (cur != null) {
            System.out.print(cur.getValue() + " - ");
            cur = cur.getNext();
        }
    }
}
