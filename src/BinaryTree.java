import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public void BFS(Node node){

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node newNode = q.poll();    // 노드 하나 꺼내기
            Node left = newNode.getLeft();  // 현재 노드의 왼쪽 자식 노드
            Node right = newNode.getRight();    // 현재 노드의 오른쪽 자식 노드

            System.out.print(newNode.getValue() + " - ");

            // 자식 노드가 존재하는 경우에만 q에 add
            if (left != null){
                q.add(left);
            }
            if (right != null){
                q.add(right);
            }
        }

    }

    public void DFS(Node node){

        Node left = node.getLeft();     // 왼쪽 자식 노드
        Node right = node.getRight();   // 오른쪽 자식 노드

        if (left != null){
            DFS(left);
        }

        // 중위 순회
        System.out.print(node.getValue() + " - ");

        if (right != null){
            DFS(right);
        }

    }

}