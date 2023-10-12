import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    Node node9 = new Node(9, null, null);
    Node node8 = new Node(8, node9, null);
    Node node7 = new Node(7, null, null);
    Node node6 = new Node(6, null, node8);
    Node node5 = new Node(5, null, node7);
    Node node4 = new Node(4, null, null);
    Node node3 = new Node(3, node6, null);
    Node node2 = new Node(2, node4, node5);
    Node node1 = new Node(1, node2, node3);

    @Test
    void BFS() {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.BFS(node1);  // 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 -
        binaryTree.BFS(node2);  // 2 - 4 - 5 - 7 -
        binaryTree.BFS(node3);  // 3 - 6 - 8 - 9 -

    }

    @Test
    void DFS() {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.DFS(node1); // 4 - 2 - 5 - 7 - 1 - 6 - 9 - 8 - 3 -
        binaryTree.DFS(node2); // 4 - 2 - 5 - 7 -
        binaryTree.DFS(node3); // 6 - 9 - 8 - 3 -

    }
}